/*
 *Time   :- 1:34 AM
 *Author :- Ramesh Dilshan
 *Special Thing :-
 */

package lk.swlc.GadgetMartBackend.GadgetMartBackend.model.orderdetail;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetailsSearchModel {

    private long id;
    private String item;
    private int qty;
    private double price;
}
