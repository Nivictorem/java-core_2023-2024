package timus;

import java.util.HashMap;
import java.util.Scanner;

public class task_2002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Object[]> dictUsers = new HashMap<>();
        int count = in.nextInt();
        in.nextLine();
        String[] command = new String[count];
        for (int i = 0; i < count; i++)
        {
            command[i] = in.nextLine();
        }
        String[] messeges = new String[count];
        for (int i = 0; i < count; i++)
        {
            String[] keyWords = command[i].split(" ");
            switch (keyWords[0])
            {
                case ("register"):
                    if(!dictUsers.containsKey(keyWords[1]))
                    {
                        dictUsers.put(keyWords[1], new Object[] {keyWords[2], false});
                        messeges[i] = "success: new user added";
                    }
                    else
                        messeges[i] = "fail: user already exists";
                    break;
                case ("login"):
                    if(dictUsers.containsKey(keyWords[1]))
                    {
                        String password = (String) dictUsers.get(keyWords[1])[0];
                        boolean isLogged = (boolean) dictUsers.get(keyWords[1])[1];
                        if(password.equals(keyWords[2]))
                        {
                            if(!isLogged)
                            {
                                messeges[i] = "success: user logged in";
                                dictUsers.get(keyWords[1])[1] = true;
                            }
                            else
                            {
                                messeges[i] = "fail: already logged in";
                            }
                        }
                        else
                        {
                            messeges[i] = "fail: incorrect password";
                        }
                    }
                    else
                        messeges[i] = "fail: no such user";
                    break;
                case ("logout"):
                    if(dictUsers.containsKey(keyWords[1]))
                    {
                        boolean isLogged = (boolean) dictUsers.get(keyWords[1])[1];
                        if(isLogged)
                        {
                            dictUsers.get(keyWords[1])[1] = false;
                            messeges[i] = "success: user logged out";
                        }
                        else
                        {
                            messeges[i] = "fail: already logged out";
                        }
                    }
                    else
                        messeges[i] = "fail: no such user";
                    break;

            }

        }
        for (String mes : messeges)
        {
            System.out.println(mes);
        }
    }
}
