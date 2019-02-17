package pl.sda.sandbox;

public interface IUserService {
    public void register(String name, String password, String email, int age, Sex sex);
}
