package jp.Magic.magic.util;

import net.minecraftforge.common.BiomeDictionary;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BiomeDictionaryHelper {
    public static BiomeDictionary.Type getType(String name){
        Map<String ,BiomeDictionary.Type> byName = BiomeDictionary.Type.getAll().stream()
                .collect(Collectors.toMap(BiomeDictionary.Type::getName, Function.identity()));
        String Name = name.toUpperCase();
        return byName.get(Name);
    }
    public static BiomeDictionary.Type[] toBiomeTypeArray(List<? extends String> strings){
        BiomeDictionary.Type[] types = new BiomeDictionary.Type[strings.size()];
        for(int i = 0 ;i < strings.size();i++){
            String string = strings.get(i);
            types[i] = getType(string);
        }
        return types;
    }
}
