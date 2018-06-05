package como.etoonet.common.hugoproject.net;


import java.util.List;

import como.etoonet.common.hugoproject.bean.Banner;
import como.etoonet.common.hugoproject.bean.DataResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by lw on 2018/1/23.
 */

public interface ApiService {
   /* *//**
     * 首页数据
     * http://www.wanandroid.com/article/list/0/json
     *
     * @param page page
     *//*
    @GET("/article/list/{page}/json")
    Observable<DataResponse<Article>> getHomeArticles(@Path("page") int page);

    *//**
     * 首页Banner
     *
     * @return BannerResponse
     */
   /* @GET("/banner/json")
    Observable<DataResponse<List<Banner>>> getHomeBanners();*/

    /**
     * 知识体系
     * http://www.wanandroid.com/tree/json
     *
     * @return BannerResponse
     */
   /* @GET("/tree/json")
    Observable<DataResponse<List<KnowledgeSystem>>> getKnowledgeSystems();
*/
    /*
    @GET("/tree/json")
    Observable<DataResponse<List<KnowledgeSystem>>> getKnowledgeSystems();

    *//**
     * 知识体系下的文章
     * http://www.wanandroid.com/article/list/0/json?cid=168
     *
     * @param page page
     * @param cid  cid
     *//*
    @GET("/article/list/{page}/json")
    Observable<DataResponse<Article>> getKnowledgeSystemArticles(@Path("page") int page, @Query("cid") int cid);


    *//**
     * 常用网站
     * http://www.wanandroid.com/friend/json
     *//*
    @GET("/friend/json")
    Observable<DataResponse<List<Friend>>> getHotFriends();

    *//**
     * 大家都在搜
     * http://www.wanandroid.com/hotkey/json
     *//*
    @GET("/hotkey/json")
    Observable<DataResponse<List<HotKey>>> getHotKeys();

    *//**
     * 搜索
     * http://www.wanandroid.com/article/query/0/json
     *
     * @param page page
     * @param k    POST search key
     *//*
    @POST("/article/query/{page}/json")
    @FormUrlEncoded
    Observable<DataResponse<Article>> getSearchArticles(@Path("page") int page, @Field("k") String k);


    *//**
     * 登录
     *
     * @param username username
     * @param password password
     * @return Deferred<User>
     *//*
    @POST("/user/login")
    @FormUrlEncoded
    Observable<DataResponse<User>> login(@Field("username") String username, @Field("password") String password);

    *//**
     * 注册
     *
     * @param username   username
     * @param password   password
     * @param repassword repassword
     * @return Deferred<User>
     *//*
    @POST("/user/register")
    @FormUrlEncoded
    Observable<DataResponse<User>> register(@Field("username") String username, @Field("password") String password, @Field("repassword") String repassword);

    *//**
     * 收藏文章
     *
     * @param id id
     * @return Deferred<DataResponse>
     *//*
    @POST("/lg/collect/{id}/json")
    Observable<DataResponse> addCollectArticle(@Path("id") int id);

    *//**
     * 收藏站外文章
     *
     * @param title  title
     * @param author author
     * @param link   link
     * @return Deferred<DataResponse>
     *//*
    @POST("/lg/collect/add/json")
    @FormUrlEncoded
    Observable<DataResponse> addCollectOutsideArticle(@Field("title") String title, @Field("author") String author, @Field("link") String link);

    *//**
     * 删除收藏文章
     *
     * @param id       id
     * @param originId -1
     * @return Deferred<DataResponse>
     *//*
    @POST("/lg/uncollect/{id}/json")
    @FormUrlEncoded
    Observable<DataResponse> removeCollectArticle(@Path("id") int id, @Field("originId") int originId);


    *//**
     * 获取自己收藏的文章列表
     *
     * @param page page
     * @return Deferred<Article>
     *//*
    @GET("/lg/collect/list/{page}/json")
    Observable<DataResponse<Article>> getCollectArticles(@Path("page") int page);

    *//**
     * 我的书签
     * http://www.wanandroid.com/lg/collect/usertools/json
     *//*
    @GET("/lg/collect/usertools/json")
    Observable<DataResponse<List<Friend>>> getBookmarks();

    *//**
     * 编辑书签
     * http://www.wanandroid.com/lg/collect/updatetool/json
     *//*
    @POST("/lg/collect/usertools/json")
    @FormUrlEncoded
    Observable<DataResponse> editBookmark(@Field("id") int id, @Field("name") String name, @Field("link") String link);

    *//**
     * 删除书签
     * http://www.wanandroid.com/lg/collect/deletetool/json
     *//*
    @POST("/lg/collect/usertools/json")
    @FormUrlEncoded
    Observable<DataResponse> delBookmark(@Field("id") int id);*/
}
