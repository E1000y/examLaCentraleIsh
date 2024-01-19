package fr.EmiliePaniagua.poec.exam.entity;

import com.fasterxml.jackson.annotation.JsonView;
import fr.EmiliePaniagua.poec.exam.JsonViews.JsonViews;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonView(JsonViews.UserListView.class)
    private Long id;


    private Date createdAt;

    @JsonView(JsonViews.UserListView.class)
    private String email;


    private String password;

    private String roles;

    @OneToMany(mappedBy = "user")
    @JsonView(JsonViews.UserShowView.class)
    private List<Listing> listings = new ArrayList<>();
}
