package lv.Functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testik {
    public String joinNumbers(List <String> list) {
        return list.stream ()
                .collect (Collectors.joining (","));
    }
}
