//numerics de vch operators  Priority D,M>A,S   between division and multipication ya fr addition and subtraction no one have greater priority only goes from left to right

//for code
//firstly make two stacks one is for value second is for operators
// let statement is 9-5+3*4/6
//if there is number then bina kujj soche ohnu val vale stack ch push krdo
// then if jh operator aw tah kujj soch k ohnu operation vale stack ch pana then sochna eh aw ki
//if jh operator vala stack khali aw tah tah bina soche ohnu operation vale stack ch pado
//then if jehre next operator th avange then check krna jo operation stack ch already koi operator peya usdi priority usde nal same aw ya fr usto vad aw tah ohnu operate krdo upro value vale stack cho 2 value kad k phla first value kdo usny val2 store kro then second usnu val1 to then dona nu kad k val1 operato val2 krke frto value vale stack ch pado 
//now code for this dry rum is:

import java.util.*;
public class Infix {
    public static void main(String[] args) {
        String str="9-5+3*4/6";    //6    //ASCII VALUE FOR '0' IS 48 AND FOR '9' IS 57
        Stack<Integer> val =new Stack<>();   // for this find ASCII values of 0 to 9       
        Stack<Character> op =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;  //character to integer
            if(ascii>=48&&ascii<=57){
                val.push(ascii-48);    //ascii-48=number     //integer to character
            }
            else if(op.size()==0){
                 op.push(ch);
            }
            else{
                if(ch=='+'||ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                    int v2=val.pop();
                    int v1=val.pop();

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                    op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
            while(val.size()>1){
                 int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
            }
            System.out.print(val.peek());
    }

}




//correct code for all cases

import java.util.*;
public class Infix {
    public static void main(String[] args) {
        String str="9-5+3*4/6";    //6    //ASCII VALUE FOR '0' IS 48 AND FOR '9' IS 57
        Stack<Integer> val =new Stack<>();   // for this find ASCII values of 0 to 9       
        Stack<Character> op =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;  //character to integer
            if(ascii>=48&&ascii<=57){
                val.push(ascii-48);    //ascii-48=number     //integer to character
            }
            else if(op.size()==0||ch=='('||op.peek()=='('){
                 op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                    int v2=val.pop();
                    int v1=val.pop();

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                    op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
            while(val.size()>1){
                 int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }

                    if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
            }
            System.out.print(val.peek());
    }

}

