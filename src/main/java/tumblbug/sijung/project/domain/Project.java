package tumblbug.sijung.project.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Project {

    @Id
    private UUID projectId;

    @Column(length= 300, nullable = false)
    @Size(min=1, max=50)
    @Pattern(regexp="\".*[ㄱ-ㅎㅏ-ㅣ가-힣|a-z|A-Z|0-9]+.*\"")
    private String projectTitle;

    @Column(columnDefinition = "TEXT", nullable = false)
    @Size(min=1, max=255)
    @Pattern(regexp="\".*[ㄱ-ㅎㅏ-ㅣ가-힣|a-z|A-Z|0-9]+.*\"")
    private String projectContent;

    @Column(length=100, nullable = false)
    @Size(min=1, max=255)
    @Pattern(regexp="\".*[ㄱ-ㅎㅏ-ㅣ가-힣|a-z|A-Z|0-9]+.*\"")
    private String createorName;

    private String creatorEmail;
    private String creatorCellphone;
    private Date projectStartDate;
    private Date projectDueDate;

    private Long targetAmount;
    private Long supportCount;
    private Long supportAmount;

    private boolean isOpen;

    private String projectStatus;
}
