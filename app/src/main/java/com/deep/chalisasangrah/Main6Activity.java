package com.deep.chalisasangrah;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
     TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        txt = (TextView)findViewById(R.id.textView5);

        Typeface myfont =  Typeface.createFromAsset(getAssets(),"fonts/Kruti_Dev_100__Bold.ttf");
        txt.setTypeface(myfont);
        txt.setMovementMethod(new ScrollingMovementMethod());

        txtLoader();


    }
    public void txtLoader(){

        String s = "श्री दुर्गा चालीसा \n" +
                "\n" +
                "नमो नमो दुर्गे सुख करनी। नमो नमो दुर्गे दुःख हरनी॥\n" +
                "निरंकार है ज्योति तुम्हारी। तिहूँ लोक फैली उजियारी॥\n" +
                "शशि ललाट मुख महाविशाला। नेत्र लाल भृकुटि विकराला॥\n" +
                "रूप मातु को अधिक सुहावे। दरश करत जन अति सुख पावे॥1॥\n" +
                "\n" +
                "तुम संसार शक्ति लै कीना। पालन हेतु अन्न धन दीना॥\n" +
                "अन्नपूर्णा हुई जग पाला। तुम ही आदि सुन्दरी बाला॥\n" +
                "प्रलयकाल सब नाशन हारी। तुम गौरी शिवशंकर प्यारी॥\n" +
                "शिव योगी तुम्हरे गुण गावें। ब्रह्मा विष्णु तुम्हें नित ध्यावें॥2॥\n" +
                "\n" +
                "रूप सरस्वती को तुम धारा। दे सुबुद्धि ऋषि मुनिन उबारा॥\n" +
                "धरयो रूप नरसिंह को अम्बा। परगट भई फाड़कर खम्बा॥\n" +
                "रक्षा करि प्रह्लाद बचायो। हिरण्याक्ष को स्वर्ग पठायो॥\n" +
                "लक्ष्मी रूप धरो जग माहीं। श्री नारायण अंग समाहीं॥3॥\n" +
                "\n" +
                "क्षीरसिन्धु में करत विलासा। दयासिन्धु दीजै मन आसा॥\n" +
                "हिंगलाज में तुम्हीं भवानी। महिमा अमित न जात बखानी॥\n" +
                "मातंगी अरु धूमावति माता। भुवनेश्वरी बगला सुख दाता॥\n" +
                "श्री भैरव तारा जग तारिणी। छिन्न भाल भव दुःख निवारिणी॥4॥\n" +
                "\n" +
                "केहरि वाहन सोह भवानी। लांगुर वीर चलत अगवानी॥\n" +
                "कर में खप्पर खड्ग विराजै ।जाको देख काल डर भाजै॥\n" +
                "सोहै अस्त्र और त्रिशूला। जाते उठत शत्रु हिय शूला॥\n" +
                "नगरकोट में तुम्हीं विराजत। तिहुँलोक में डंका बाजत॥5॥\n" +
                "\n" +
                "शुम्भ निशुम्भ दानव तुम मारे। रक्तबीज शंखन संहारे॥\n" +
                "महिषासुर नृप अति अभिमानी। जेहि अघ भार मही अकुलानी॥\n" +
                "रूप कराल कालिका धारा। सेन सहित तुम तिहि संहारा॥\n" +
                "परी गाढ़ सन्तन र जब जब। भई सहाय मातु तुम तब तब॥6॥\n" +
                "\n" +
                "अमरपुरी अरु बासव लोका। तब महिमा सब रहें अशोका॥\n" +
                "ज्वाला में है ज्योति तुम्हारी। तुम्हें सदा पूजें नरनारी॥\n" +
                "प्रेम भक्ति से जो यश गावें। दुःख दारिद्र निकट नहिं आवें॥\n" +
                "ध्यावे तुम्हें जो नर मन लाई। जन्ममरण ताकौ छुटि जाई॥7॥\n" +
                "\n" +
                "जोगी सुर मुनि कहत पुकारी।योग न हो बिन शक्ति तुम्हारी॥\n" +
                "शंकर आचारज तप कीनो। काम अरु क्रोध जीति सब लीनो॥\n" +
                "निशिदिन ध्यान धरो शंकर को। काहु काल नहिं सुमिरो तुमको॥\n" +
                "शक्ति रूप का मरम न पायो। शक्ति गई तब मन पछितायो॥8॥\n" +
                "\n" +
                "शरणागत हुई कीर्ति बखानी। जय जय जय जगदम्ब भवानी॥\n" +
                "भई प्रसन्न आदि जगदम्बा। दई शक्ति नहिं कीन विलम्बा॥\n" +
                "मोको मातु कष्ट अति घेरो। तुम बिन कौन हरै दुःख मेरो॥\n" +
                "आशा तृष्णा निपट सतावें। मोह मदादिक सब बिनशावें॥9॥\n" +
                "\n" +
                "शत्रु नाश कीजै महारानी। सुमिरौं इकचित तुम्हें भवानी॥\n" +
                "करो कृपा हे मातु दयाला। ऋद्धिसिद्धि दै करहु निहाला॥\n" +
                "जब लगि जिऊँ दया फल पाऊँ । तुम्हरो यश मैं सदा सुनाऊँ ॥\n" +
                "श्री दुर्गा चालीसा जो कोई गावै। सब सुख भोग परमपद पावै॥10॥\n" +
                "\n" +
                "देवीदास शरण निज जानी। कहु कृपा जगदम्ब भवानी॥\n" +
                "\n" ;

        txt.setText(s);

    }
}