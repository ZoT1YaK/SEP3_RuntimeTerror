using Application.DAOInterfaces;
using Shared.DTOs;

namespace GrpcClient.DAO;

public class UserDao : IUserDAO
{

    private UserService.UserServiceClient userServiceClient;

    public UserDao(UserService.UserServiceClient userServiceClient)
    {
        this.userServiceClient = userServiceClient;
    }

    public async Task<Shared.Models.User> CreateUserAsync(Shared.Models.User user)
    {
        var userToCreate = new RegisterUser
        {
            Username = user.userName,
            Password = user.password,
            FName = user.FirstName,
            LName = user.LastName
        };

        User grpcUserToCreate = await userServiceClient.CreateUserAsync(userToCreate);

        return ConvertGrpcUserToSharedUser(grpcUserToCreate);
    }

    public async Task<Shared.Models.User> LoginUserAsync(Shared.Models.User user)
    {
        var userToLogin = new LoginUser
        {
            Username = user.userName,
            Password = user.password
        };

        User grpcUserToLogin = await userServiceClient.LoginUsersAsync(userToLogin);

        return ConvertGrpcUserToSharedUser(grpcUserToLogin);
    }

    public async Task<Shared.Models.User> FindUserAsync(string userName)
    {
        var username = new SearchField
        {
            Search = userName
        };

        try
        {
            User user = await userServiceClient.FindUserAsync(username);
            return ConvertGrpcUserToSharedUser(user);
        }
        catch
        {
            return null;
        }
    }

    public async Task AddCreditsAsync(int credits, string username)
    {
        var creditsUser = new CreditsUser
        {
            Credits = credits,
            Username = username
        };

        await userServiceClient.AddCreditsAsync(creditsUser);
    }

    public async Task RemoveCreditsAsync(int credits, string username)
    {
        var creditsUser = new CreditsUser
        {
            Credits = credits,
            Username = username
        };

        await userServiceClient.RemoveCreditsAsync(creditsUser);
    }

    public async Task UpdateUserInfoAsync(UserInfoCreationDTO dto)
    {
        var userInfo = new UserInfo
        {
            Username = dto.username,
            FName = dto.FirstName,
            LName = dto.LastName,
            Phone = dto.phone,
            Address = ConvertSharedAddressToGrpcAddress(dto.Address)
        };

        await userServiceClient.UpdateUserInformationAsync(userInfo);
    }

    private Shared.Models.User ConvertGrpcUserToSharedUser(User grpcUser)
    {
        var sharedUser = new Shared.Models.User
        {
            userName = grpcUser.Username,
            password = grpcUser.Password,
            FirstName = grpcUser.FName,
            LastName = grpcUser.LName,
            Credits = grpcUser.Credits,
            type = grpcUser.Type,
            phone = grpcUser.Phone,
            Address = ConvertGrpcAddressToSharedAddress(grpcUser.Address)
        };
        
        return sharedUser;
    }

    private Address ConvertSharedAddressToGrpcAddress(Shared.Models.Address address)
    {
        return new Address
        {
            Country = address.Country,
            City = address.City,
            Zip = address.Zip,
            Street = address.Street
        };
    }
    
    private Shared.Models.Address ConvertGrpcAddressToSharedAddress(Address address)
    {
        return new Shared.Models.Address
        {
            Country = address.Country,
            City = address.City,
            Zip = address.Zip,
            Street = address.Street
        };
    }
}