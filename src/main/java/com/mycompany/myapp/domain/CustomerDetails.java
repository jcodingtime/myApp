package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mycompany.myapp.domain.enumeration.Gender;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * A CustomerDetails.
 */
@Entity
@Table(name = "customer_details")
public class CustomerDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @NotNull
    @Column(name = "phone", nullable = false)
    private String phone;

    @NotNull
    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;

    @Min(value = 0)
    @Column(name = "number_address_line_1")
    private Integer numberAddressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @NotNull
    @Column(name = "city", nullable = false)
    private String city;

    @NotNull
    @Column(name = "country", nullable = false)
    private String country;

    @Min(value = 0)
    @Column(name = "age")
    private Integer age;

    @OneToOne(optional = false)
    @NotNull
    @JoinColumn(unique = true)
    private User user;

    @OneToMany(mappedBy = "customerDetails")
    @JsonIgnoreProperties(value = { "orders", "customerDetails" }, allowSetters = true)
    private Set<ShoppingCart> carts = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerDetails id(Long id) {
        this.id = id;
        return this;
    }

    public Gender getGender() {
        return this.gender;
    }

    public CustomerDetails gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public CustomerDetails phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public CustomerDetails addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Integer getNumberAddressLine1() {
        return this.numberAddressLine1;
    }

    public CustomerDetails numberAddressLine1(Integer numberAddressLine1) {
        this.numberAddressLine1 = numberAddressLine1;
        return this;
    }

    public void setNumberAddressLine1(Integer numberAddressLine1) {
        this.numberAddressLine1 = numberAddressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public CustomerDetails addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public CustomerDetails city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public CustomerDetails country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return this.age;
    }

    public CustomerDetails age(Integer age) {
        this.age = age;
        return this;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User getUser() {
        return this.user;
    }

    public CustomerDetails user(User user) {
        this.setUser(user);
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<ShoppingCart> getCarts() {
        return this.carts;
    }

    public CustomerDetails carts(Set<ShoppingCart> shoppingCarts) {
        this.setCarts(shoppingCarts);
        return this;
    }

    public CustomerDetails addCart(ShoppingCart shoppingCart) {
        this.carts.add(shoppingCart);
        shoppingCart.setCustomerDetails(this);
        return this;
    }

    public CustomerDetails removeCart(ShoppingCart shoppingCart) {
        this.carts.remove(shoppingCart);
        shoppingCart.setCustomerDetails(null);
        return this;
    }

    public void setCarts(Set<ShoppingCart> shoppingCarts) {
        if (this.carts != null) {
            this.carts.forEach(i -> i.setCustomerDetails(null));
        }
        if (shoppingCarts != null) {
            shoppingCarts.forEach(i -> i.setCustomerDetails(this));
        }
        this.carts = shoppingCarts;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerDetails)) {
            return false;
        }
        return id != null && id.equals(((CustomerDetails) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CustomerDetails{" +
            "id=" + getId() +
            ", gender='" + getGender() + "'" +
            ", phone='" + getPhone() + "'" +
            ", addressLine1='" + getAddressLine1() + "'" +
            ", numberAddressLine1=" + getNumberAddressLine1() +
            ", addressLine2='" + getAddressLine2() + "'" +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            ", age=" + getAge() +
            "}";
    }
}
