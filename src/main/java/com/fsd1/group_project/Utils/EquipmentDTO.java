package com.fsd1.group_project.Utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentDTO {
    private Long id;
    private String name;
    private String description;
    private String category;
    private Integer quantity;
    private String condition;
    private Double costPerUnit;
    private String location;
    private String status;
    private LocalDateTime lastMaintenance;
    private LocalDateTime nextMaintenance;
} 