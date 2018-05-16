package com.journaldev.retrofitintro;

import com.journaldev.retrofitintro.pojo.MultipleResource;
import com.journaldev.retrofitintro.pojo.User;
import com.journaldev.retrofitintro.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.Query;

/**
 * Created by 8019 on 9/23/2017.
 */

public class Test implements APIInterface {
    @Override
    public Call<MultipleResource> doGetListResources() {
        return null;
    }

    @Override
    public Call<User> createUser(@Body User user) {
        return null;
    }

    @Override
    public Call<UserList> doGetUserList(@Query("page") String page) {
        return null;
    }

    @Override
    public Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job) {
        return null;
    }
}
