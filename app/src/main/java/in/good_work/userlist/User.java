package in.good_work.userlist;

/**
 * Created by AELEX on 06.06.2017.
 */

public class User {
    private long userId;
    private String mName;
    private String mSurname;
    private String mPhone;
    private String mMail;
    private String urlPhoto;

    public User(long userId, String mName, String mSurname, String mPhone, String mMail, String urlPhoto) {
        this.userId = userId;
        this.mName = mName;
        this.mSurname = mSurname;
        this.mPhone = mPhone;
        this.mMail = mMail;
        this.urlPhoto = urlPhoto;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSurname() {
        return mSurname;
    }

    public void setmSurname(String mSurname) {
        this.mSurname = mSurname;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmMail() {
        return mMail;
    }

    public void setmMail(String mMail) {
        this.mMail = mMail;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", mName='" + mName + '\'' +
                ", mSurname='" + mSurname + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mMail='" + mMail + '\'' +
                ", urlPhoto='" + urlPhoto + '\'' +
                '}';
    }
}
