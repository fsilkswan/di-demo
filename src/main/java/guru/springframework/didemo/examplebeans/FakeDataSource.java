package guru.springframework.didemo.examplebeans;

public final class FakeDataSource
{
    private String password;
    private String databaseUrl;
    private String username;

    public String getPassword()
    {
        return password;
    }

    public String getDatabaseUrl()
    {
        return databaseUrl;
    }

    public String getUsername()
    {
        return username;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }

    public void setDatabaseUrl(final String databaseUrl)
    {
        this.databaseUrl = databaseUrl;
    }

    public void setUsername(final String username)
    {
        this.username = username;
    }
}