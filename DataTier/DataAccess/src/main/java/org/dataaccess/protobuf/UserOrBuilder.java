// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package org.dataaccess.protobuf;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string f_name = 3;</code>
   * @return The fName.
   */
  java.lang.String getFName();
  /**
   * <code>string f_name = 3;</code>
   * @return The bytes for fName.
   */
  com.google.protobuf.ByteString
      getFNameBytes();

  /**
   * <code>string l_name = 4;</code>
   * @return The lName.
   */
  java.lang.String getLName();
  /**
   * <code>string l_name = 4;</code>
   * @return The bytes for lName.
   */
  com.google.protobuf.ByteString
      getLNameBytes();

  /**
   * <code>int32 credits = 5;</code>
   * @return The credits.
   */
  int getCredits();

  /**
   * <code>string type = 6;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 6;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string phone = 7;</code>
   * @return The phone.
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 7;</code>
   * @return The bytes for phone.
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>.Address address = 8;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.Address address = 8;</code>
   * @return The address.
   */
  org.dataaccess.protobuf.Address getAddress();
  /**
   * <code>.Address address = 8;</code>
   */
  org.dataaccess.protobuf.AddressOrBuilder getAddressOrBuilder();
}
