package com.customerService.model;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private StudentStatus paymentMethod;

    public Student(Long id, String firstName, String lastName, String email, StudentStatus paymentMethod) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentStatus getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(StudentStatus paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
