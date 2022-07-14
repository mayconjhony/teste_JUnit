package compra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;

import java.util.List;

@Setter
@Builder
@AllArgsConstructor
public class Compra {
    private List<Item> itens;
}
