package com.example.dto;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable
{
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;

    public User () { }

    public User (long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "com.example.dto.User{" + "id=" + id +
            ", Name='" + firstName + '\'' +
            ", Last Name=" + lastName + '\'' +
            ", Email =" + email + '\'' +
            ", Password=" + password + '\'' + '}';
    }
}
