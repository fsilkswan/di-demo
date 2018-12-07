package guru.springframework.didemo.examplebeans;

public final class FakeJmsBroker
{
    private String password;
    private String url;
    private String username;

    public String getPassword()
    {
        return password;
    }

    public String getUrl()
    {
        return url;
    }

    public String getUsername()
    {
        return username;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }

    public void setUrl(final String url)
    {
        this.url = url;
    }

    public void setUsername(final String username)
    {
        this.username = username;
    }
}