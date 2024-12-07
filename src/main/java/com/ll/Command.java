package com.ll;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Command {
    private final String actionName;
    private final Map<String, String> params;

    public Command(String cmd) {
        this.params = new HashMap<>();
        // 수정?id=1
        String[] cmdBits = cmd.split("\\?", 2); // 수정, id=1
        this.actionName = cmdBits[0].trim();

        if(cmdBits.length == 1) return; // 종료, 등록, 목록

        String queryString = cmdBits[1].trim(); // id=1

        String[] params = queryString.split("&");

        for (String param : params) {
            String[] paramsBits = param.split("=", 2);
            if(paramsBits.length == 2) this.params.put(paramsBits[0], paramsBits[1]);
        }
    }

    public int getParamAsInt(String key) {
        try {
            String value = params.get(key);
            if (value == null) return 0;
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
