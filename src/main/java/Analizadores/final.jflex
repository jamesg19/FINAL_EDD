package Analizadores;

import static Analizadores.sym.*;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
//%cupsym "sym"
%unicode
%full
%line
%char
%column
%public
%state ESTUDIANTE, USUARIO, CATEDRATICO, EDIFICIO, SALON
%state CURSO, HORARIO, ASIGNAR, COMILLA


numeros=[0-9]+
letras=[ 0-9a-zA-Z:\-_À-ÿ¿\u00f1\u00d1]+
letra=[0-9a-zA-Z:_\-À-ÿ¿\u00f1\u00d1]+
comillas=[\"]
espacios=[ |\r|\t|\n]+


//palabras reservadas
estudiante=[Ee][Ss][Tt][Uu][Dd][Ii][Aa][Nn][Tt][Ee]
colaborador=[Cc][Oo][Ll][Aa][Bb][Oo][Rr][Aa][Dd][Oo][Rr]
usuario=[U][s][u][a][r][i][o]
catedratico= [C][a][t][e][d][r][a][t][i][c][o]
edificio= [E][d][i][f][i][c][i][o]
salon= [S][a][l][o][n]
curso= [C][u][r][s][o]
horario= [H][o][r][a][r][i][o]
asignar= [A][s][i][g][n][a][r]
coma=[,]
puntocoma=[;]
parentesis_abre=[(]
parentesis_cierra=[)]

%{

%}
//%eof{
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
//%eof}
%%

<YYINITIAL>{


    {estudiante} {return new Symbol(sym.ESTUDIANTE,yyline+1, yycolumn+1,yytext());}
    {colaborador} {return new Symbol(sym.COLABORADOR,yyline+1, yycolumn+1,yytext());}
    {numeros} {return new Symbol(sym.NUMEROS,yyline+1, yycolumn+1,yytext());}
    {usuario} {return new Symbol(sym.USUARIO,yyline+1, yycolumn+1,yytext());}
    {catedratico} {return new Symbol(sym.CATEDRATICO,yyline+1, yycolumn+1,yytext());}
    {edificio} {return new Symbol(sym.EDIFICIO,yyline+1, yycolumn+1,yytext());}
    {salon} {return new Symbol(sym.SALON,yyline+1, yycolumn+1,yytext());}
    {curso} {return new Symbol(sym.CURSO,yyline+1, yycolumn+1,yytext());}
    {horario} {return new Symbol(sym.HORARIO,yyline+1, yycolumn+1,yytext());}
    {asignar} {return new Symbol(sym.ASIGNAR,yyline+1, yycolumn+1,yytext());}
    {comillas} { yybegin(COMILLA); return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}
    {coma} {  return new Symbol(sym.COMA,yyline+1, yycolumn+1,yytext());}
    {puntocoma} {  return new Symbol(sym.PUNTO_COMA,yyline+1, yycolumn+1,yytext());}
    {parentesis_abre} { return new Symbol(sym.PARENTESIS_ABRE,yyline+1, yycolumn+1,yytext());}
    {parentesis_cierra} { return new Symbol(sym.PARENTESIS_CIERRA,yyline+1, yycolumn+1,yytext());}
    {letra} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext());}
    {espacios} { }


    
}
<COMILLA>{
    {comillas} { yybegin(YYINITIAL); return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}
    {letras} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext());}
}
/* Para cualquier otro simbolo no especificado u error lexico devuelve el error */
[^]
{	
    
}