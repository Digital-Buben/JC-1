package L10.util;

import L10.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static L10.domain.Sentence.REGEXP_WORDS_SIMBOLS;
import static L10.domain.Text.REGEXP_PARAGRAPHS;
import static L10.domain.Words.REGEXP_WORDS;

public class Util {
    public static List<Composite> textParser(String text){
        List<Composite> paragraphs = new ArrayList<>();
        String paragString = "";
        Paragraph paragraph;
        Pattern parags = Pattern.compile(REGEXP_PARAGRAPHS);
        Matcher mParags = parags.matcher(text);
        while (mParags.find()) {
            paragString = mParags.group();
            List<Composite> par = new java.util.ArrayList<>();
            par = paragraphParser(paragString);
            paragraph = new Paragraph(par) ;
            paragraphs.add(paragraph);
        }// while (mParags.find());
        return paragraphs;
    }

    public static List<Composite> paragraphParser(String text){
        List<Composite> sentences = new java.util.ArrayList<>();
        Sentence sentence;
        String sentenceString = "";
        Pattern sents = Pattern.compile(REGEXP_PARAGRAPHS);
        Matcher mSents = sents.matcher(text);
        while (mSents.find()) {
            sentenceString = mSents.group();
            List<Composite> par = new java.util.ArrayList<>();
            par = sentenceParser(sentenceString);
            sentence = new Sentence(par) ;
            sentences.add(sentence);
        } //while (mSents.find());
        return sentences;
    }

    public static List<Composite> sentenceParser(String text){
        List<Composite> sentences = new java.util.ArrayList<>();
        Sentence sentence;
        String sentenceString = "";
        Pattern sents = Pattern.compile(REGEXP_PARAGRAPHS);
        Matcher mSents = sents.matcher(text);
        while (mSents.find()) {
            sentenceString = mSents.group();
            List<Composite> sent = new java.util.ArrayList<>();
            sent = WSParser(sentenceString);
            sentence = new Sentence(sent) ;
            sentences.add(sentence);
        } //while (mSents.find());
        return sentences;
    }
    public static List<Composite> WSParser(String text){
        List<Composite> sentences = new java.util.ArrayList<>();
        Words word;
        Simbols simbol;
        String wSstring = "";
        Pattern wSS = Pattern.compile(REGEXP_WORDS_SIMBOLS);
        Matcher mWSS = wSS.matcher(text);
        Pattern words = Pattern.compile(REGEXP_WORDS);

        while (mWSS.find()) {
            wSstring = mWSS.group();
            if (wSstring.matches(REGEXP_WORDS) ){
                word = new Words(wSstring);
                sentences.add(word);
            } else {
                simbol = new Simbols(wSstring);
                sentences.add(simbol);
            }
        } //while (mWSS.find());
        return sentences;
    }
}
