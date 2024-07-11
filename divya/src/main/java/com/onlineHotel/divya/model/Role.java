package com.onlineHotel.divya.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Set<User> users = new HashSet<>();

    // No-argument constructor
    public Role() {
    }

    // Constructor with name
    public Role(String name) {
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    // Add a user to this role
    public void assignRoleToUser(User user) {
        users.add(user);
        user.getRoles().add(this);
    }

    // Remove a user from this role
    public void removeUserFromRole(User user) {
        users.remove(user);
        user.getRoles().remove(this);
    }

    // Remove all users from this role
    public void removeAllUsersFromRole() {
        for (User user : users) {
            user.getRoles().remove(this);
        }
        users.clear();
    }
}
