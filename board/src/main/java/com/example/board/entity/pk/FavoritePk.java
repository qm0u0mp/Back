package com.example.board.entity.pk;

import java.io.Serializable;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavoritePk implements Serializable {

    @Column(name = "board_number")
    private Integer boardNumber;
    @Column(name = "board_number")
    private String userEmail;
}
