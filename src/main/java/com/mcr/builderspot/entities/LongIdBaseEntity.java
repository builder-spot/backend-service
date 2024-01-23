package com.mcr.builderspot.entities;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Data;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)
})
@MappedSuperclass
public class LongIdBaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    void createDate() {
        if (createdAt == null) {
            setCreatedAt(LocalDateTime.now());
        }
        setUpdatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void updatedAt() {
        setUpdatedAt(LocalDateTime.now());
    }

}