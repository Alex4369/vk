package domain;

public class Post {
    private String id; //номер владельца записи
    private String ownerId;//поле из документации
    private String fromId;//поле из документации
    private String createdBy;//поле из документации
    private String data; //дата поста
    private String text; //название поста
    private String replyOwnerId;//поле из документации
    private String replyPostId;//поле из документации
    private String friendsOnly;//поле из документации
    private String image; //картинка поста
    private String favorites; //кнопка избранное
    private String read; //кнопка читать
    private LikesInfo likesInfo; //лайки
    private CommentsInfo commentsInfo; //коментарии
    private SharesInfo sharesInfo; //репост
    private ViewsInfo viewsInfo; //просмотры
    private String postType;//поле из документации
    private String postSource;//поле из документации
    private String geo;//поле из документации
    private String signerId;//поле из документации
    private String copyHistory;//поле из документации
    private String canPin;//поле из документации
    private String canDelete;//поле из документации
    private String canEdit;
    private String isPinned;//поле из документации
    private String marketAsAds;//поле из документации
    private String isFavorite;//поле из документации
    private String postPonedId;//поле из документации
    //+get/set на все поля
}
