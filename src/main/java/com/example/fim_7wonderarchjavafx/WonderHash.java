package com.example.fim_7wonderarchjavafx;

import com.example.fim_7wonderarchjavafx.domain.Piece;
import com.example.fim_7wonderarchjavafx.domain.Wonder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface WonderHash {
    HashMap<String, Boolean> isWonderAvailable = new HashMap<>();
    HashMap<String, Wonder> wondersHash = new HashMap<>();

}
