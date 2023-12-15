package pairmatching.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level {
    private final Map<String, List<String>> levelMission = new HashMap<String, List<String>>() {{
        put("레벨1", Arrays.asList("자동차경주", "로또", "숫자야구게임"));
        put("레벨2", Arrays.asList("장바구니", "결제", "지하철노선도"));
        put("레벨3", Collections.emptyList());
        put("레벨4", Arrays.asList("성능개선", "배포"));
        put("레벨5", Collections.emptyList());
    }};
    private final String currentLevel;
    private final String currentMission;

    public Level(String Level, String mission) {
        this.currentLevel = Level;
        this.currentMission = mission;
    }
}
