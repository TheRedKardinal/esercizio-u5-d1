package claudiogiasi.eserciziou5d1.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor

public class POI {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, name = "tipo_segnalazione")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private BigDecimal latitude;

    @Column(nullable = false)
    private BigDecimal longitude;

    private Instant createdAt;

    public POI(String name, String description, Role role, BigDecimal latitude, BigDecimal longitude) {
        this.name = name;
        this.description = description;
        this.role = role;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdAt = Instant.now();
    }
}
