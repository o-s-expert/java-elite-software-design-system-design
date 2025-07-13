package expert.os.examples.users.service;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
  public void register(String userDetails) {
    System.out.println("Registering user: " + userDetails);
  }

    public void update(String userId, String userDetails) {
        System.out.println("Updating user " + userId + " with details: " + userDetails);
    }

    public void delete(String userId) {
        System.out.println("Deleting user with ID: " + userId);
    }

    public void getUser(String userId) {
        System.out.println("Retrieving user with ID: " + userId);
    }
}
