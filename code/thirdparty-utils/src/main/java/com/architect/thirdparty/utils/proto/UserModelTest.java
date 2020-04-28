package com.architect.thirdparty.utils.proto;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author CNan
 */
public class UserModelTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        UserModel.User.Builder userBuilder = UserModel.User.newBuilder();
        userBuilder.setId(1);
        userBuilder.setName("Test");
        userBuilder.setSex(2);

        UserModel.User user = userBuilder.build();

        System.out.println(user.toString());


        byte[] array = user.toByteArray();

        UserModel.User after = UserModel.User.parseFrom(array);

        System.out.println(after.toString());
    }
}
