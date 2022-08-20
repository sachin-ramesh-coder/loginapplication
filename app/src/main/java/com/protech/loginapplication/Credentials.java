package com.protech.loginapplication;

import java.util.HashMap;
import java.util.Map;

public class Credentials {

    HashMap<String, String> credentialsMapper = new HashMap<String,String>();

    public void addCredentials(String  username,String password){
        credentialsMapper.put(username,password);
    }

    public boolean checkUsername(String username){
         return credentialsMapper.containsKey(username);
    }

    public boolean verifyCredentials(String username,String password){

        /* Checks if user name exists*/
        if (credentialsMapper.containsKey(username)){

            /* If password Matches*/
            if (password.equals(credentialsMapper.get(username))){
                return true;
            }
        }
        return false;
    }

    public void loadCredentials(Map<String, ?> preferencesMap){
        for (Map.Entry<String, ?> entries : preferencesMap.entrySet()){
            if (!entries.getKey().equals("RememberMeCheckbox")){
                credentialsMapper.put(entries.getKey(),entries.getValue().toString());
            }
        }
    }

}