package com.freshfork.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class User{
private Set<Diet> diet;

@ManyToMany
public Set<Diet> getDiet() {
   return this.diet;
}

public void setDiet(Set<Diet> diets) {
   this.diet = diets;
}

private Set<Recipe> creattedRecipes;

@OneToMany(mappedBy="author")
public Set<Recipe> getCreattedRecipes() {
   return this.creattedRecipes;
}

public void setCreattedRecipes(Set<Recipe> creattedRecipess) {
   this.creattedRecipes = creattedRecipess;
}

private Set<Recipe> favoriteREcipes;

@ManyToMany
public Set<Recipe> getFavoriteREcipes() {
   return this.favoriteREcipes;
}

public void setFavoriteREcipes(Set<Recipe> favoriteREcipess) {
   this.favoriteREcipes = favoriteREcipess;
}

private Set<Ingredient> allergy;

@ManyToMany
public Set<Ingredient> getAllergy() {
   return this.allergy;
}

public void setAllergy(Set<Ingredient> allergys) {
   this.allergy = allergys;
}

private int uId;

public void setUId(int value) {
this.uId = value;
    }
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getUId() {
return this.uId;
    }
private String name;

public void setName(String value) {
this.name = value;
    }
public String getName() {
return this.name;
    }
private String email;

public void setEmail(String value) {
this.email = value;
    }
public String getEmail() {
return this.email;
    }
private String password;

public void setPassword(String value) {
this.password = value;
    }
public String getPassword() {
return this.password;
    }
private boolean isPro;

public void setIsPro(boolean value) {
this.isPro = value;
    }
public boolean isIsPro() {
return this.isPro;
       }
   }
