package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String foodid;
    private String preference;
    private String orderid;
    private String sts;
}


