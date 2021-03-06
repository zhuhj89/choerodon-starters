package io.choerodon.asgard.saga.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class SagaTaskInstanceDTO {

    private Long id;

    private Long sagaInstanceId;

    private String taskCode;

    private String sagaCode;

    private String instanceLock;

    private String status;

    private Integer seq;

    private Integer maxRetryCount;

    private Integer retriedCount;

    private Integer timeoutSeconds;

    private String timeoutPolicy;

    private String exceptionMessage;

    private String refType;

    private String refId;

    private Integer concurrentLimitNum;

    private String concurrentLimitPolicy;

    private String input;

    private String output;

    private String creationDate;

    private String description;

    private String service;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SagaTaskInstanceDTO that = (SagaTaskInstanceDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

//    @Override
//    public String toString() {
//        return "SagaTaskInstanceDTO{" +
//                "id=" + id +
//                ", sagaInstanceId=" + sagaInstanceId +
//                ", taskCode='" + taskCode + '\'' +
//                ", sagaCode='" + sagaCode + '\'' +
//                ", instanceLock='" + instanceLock + '\'' +
//                ", status='" + status + '\'' +
//                ", seq=" + seq +
//                ", input='" + input + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "SagaTaskInstanceDTO{" +
                "id=" + id +
                ", taskCode='" + taskCode + '\'' +
                ", sagaCode='" + sagaCode + '\'' +
                ", instanceLock='" + instanceLock + '\'' +
                '}';
    }
}
