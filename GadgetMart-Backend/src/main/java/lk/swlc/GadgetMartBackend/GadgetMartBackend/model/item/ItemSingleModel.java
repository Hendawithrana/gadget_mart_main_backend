/*
 *Time   :- 2:35 PM
 *Author :- Ramesh Dilshan
 *Special Thing :-
 */

package lk.swlc.GadgetMartBackend.GadgetMartBackend.model.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ItemSingleModel {

    private String message;


    @JsonProperty("data")
    private Item item;
}
