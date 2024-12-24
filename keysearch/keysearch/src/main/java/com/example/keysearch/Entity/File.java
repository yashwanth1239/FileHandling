package com.example.keysearch.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "File_db")
@NoArgsConstructor
@AllArgsConstructor
public class File {
    @Id
    @Column(name = "ID")
    private int key;
    @Column(name = "FILE_DATA")
    private int data;
}
