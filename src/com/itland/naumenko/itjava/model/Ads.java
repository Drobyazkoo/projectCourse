package com.itland.naumenko.itjava.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ads {
    private int id;
    private String title;
    private String subtitle;
    private String description;
    private Double price;
    private int userId;
}
