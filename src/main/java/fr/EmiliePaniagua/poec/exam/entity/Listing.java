package fr.EmiliePaniagua.poec.exam.entity;

import com.fasterxml.jackson.annotation.JsonView;
import fr.EmiliePaniagua.poec.exam.JsonViews.JsonViews;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonView(JsonViews.UserShowView.class)
    private Long id;

    @JsonView(JsonViews.UserShowView.class)
    private String title;
    @JsonView(JsonViews.UserShowView.class)
    private String description;
    @JsonView(JsonViews.UserShowView.class)
    private int producedYear ;
    @JsonView(JsonViews.UserShowView.class)
    private Long mileage;
    @JsonView(JsonViews.UserShowView.class)
    private Long price;
    @JsonView(JsonViews.UserShowView.class)
    private Date createdAt;

    @Nullable
    @JsonView(JsonViews.UserShowView.class)
    private String image;

    @ManyToOne
    private User user;

    @ManyToOne
    private Model model;
}
