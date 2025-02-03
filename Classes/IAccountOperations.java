package Classes;

public interface IAccountOperations {
    abstract void addAccount();
    abstract boolean checkAccount(String email, String password);
}