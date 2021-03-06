package com.deep.chalisasangrah;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
       TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt = (TextView)findViewById(R.id.textView2);

        Typeface myfont =  Typeface.createFromAsset(getAssets(),"fonts/Kruti_Dev_100__Bold.ttf");
        txt.setTypeface(myfont);
        txt.setMovementMethod(new ScrollingMovementMethod());

        txtLoader();


    }
    public void txtLoader(){

        String s = "श्री शिव चालीसा \n" +
                "\n" +
                "।।दोहा।।\n" +
                "\n" +
                "श्री गणेश गिरिजा सुवन, मंगल मूल सुजान।\n" +
                "कहत अयोध्यादास तुम, देहु अभय वरदान॥\n" +
                "\n" +
                "जय गिरिजा पति दीन दयाला। सदा करत सन्तन प्रतिपाला॥\n" +
                "भाल चन्द्रमा सोहत नीके। कानन कुण्डल नागफनी के॥\n" +
                "अंग गौर शिर गंग बहाये। मुण्डमाल तन छार लगाये॥\n" +
                "वस्त्र खाल बाघम्बर सोहे। छवि को देख नाग मुनि मोहे॥1॥\n" +
                "\n" +
                "मैना मातु की ह्वै दुलारी। बाम अंग सोहत छवि न्यारी॥\n" +
                "कर त्रिशूल सोहत छवि भारी। करत सदा शत्रुन क्षयकारी॥\n" +
                "नन्दि गणेश सोहै तहँ कैसे। सागर मध्य कमल हैं जैसे॥\n" +
                "कार्तिक श्याम और गणराऊ। या छवि को कहि जात न काऊ॥2॥\n" +
                "\n" +
                "देवन जबहीं जाय पुकारा। तब ही दुख प्रभु आप निवारा॥\n" +
                "किया उपद्रव तारक भारी। देवन सब मिलि तुमहिं जुहारी॥\n" +
                "तुरत षडानन आप पठायउ। लवनिमेष महँ मारि गिरायउ॥\n" +
                "आप जलंधर असुर संहारा। सुयश तुम्हार विदित संसारा॥3॥\n" +
                "\n" +
                "त्रिपुरासुर सन युद्ध मचाई। सबहिं कृपा कर लीन बचाई॥\n" +
                "किया तपहिं भागीरथ भारी। पुरब प्रतिज्ञा तसु पुरारी॥\n" +
                "दानिन महं तुम सम कोउ नाहीं। सेवक स्तुति करत सदाहीं॥\n" +
                "वेद नाम महिमा तव गाई। अकथ अनादि भेद नहिं पाई॥4॥\n" +
                "\n" +
                "प्रगट उदधि मंथन में ज्वाला। जरे सुरासुर भये विहाला॥\n" +
                "कीन्ह दया तहँ करी सहाई। नीलकण्ठ तब नाम कहाई॥\n" +
                "पूजन रामचंद्र जब कीन्हा। जीत के लंक विभीषण दीन्हा॥\n" +
                "सहस कमल में हो रहे धारी। कीन्ह परीक्षा तबहिं पुरारी॥5॥\n" +
                "\n" +
                "एक कमल प्रभु राखेउ जोई। कमल नयन पूजन चहं सोई॥\n" +
                "कठिन भक्ति देखी प्रभु शंकर। भये प्रसन्न दिए इच्छित वर॥\n" +
                "जय जय जय अनंत अविनाशी। करत कृपा सब के घटवासी॥\n" +
                "दुष्ट सकल नित मोहि सतावै । भ्रमत रहे मोहि चैन न आवै॥6॥\n" +
                "\n" +
                "त्राहि त्राहि मैं नाथ पुकारो। यहि अवसर मोहि आन उबारो॥\n" +
                "लै त्रिशूल शत्रुन को मारो। संकट से मोहि आन उबारो॥\n" +
                "मातु पिता भ्राता सब कोई। संकट में पूछत नहिं कोई॥\n" +
                "स्वामी एक है आस तुम्हारी। आय हरहु अब संकट भारी॥7॥\n" +
                "\n" +
                "धन निर्धन को देत सदाहीं। जो कोई जांचे वो फल पाहीं॥\n" +
                "अस्तुति केहि विधि करौं तुम्हारी। क्षमहु नाथ अब चूक हमारी॥\n" +
                "शंकर हो संकट के नाशन। मंगल कारण विघ्न विनाशन॥\n" +
                "योगी यति मुनि ध्यान लगावैं। नारद शारद शीश नवावैं॥8॥\n" +
                "\n" +
                "नमो नमो जय नमो शिवाय। सुर ब्रह्मादिक पार न पाय॥\n" +
                "जो यह पाठ करे मन लाई। ता पार होत है शम्भु सहाई॥\n" +
                "ॠनिया जो कोई हो अधिकारी। पाठ करे सो पावन हारी॥\n" +
                "पुत्र हीन कर इच्छा कोई। निश्चय शिव प्रसाद तेहि होई॥9॥\n" +
                "\n" +
                "पण्डित त्रयोदशी को लावे। ध्यान पूर्वक होम करावे ॥\n" +
                "त्रयोदशी ब्रत करे हमेशा। तन नहीं ताके रहे कलेशा॥\n" +
                "धूप दीप नैवेद्य चढ़ावे। शंकर सम्मुख पाठ सुनावे॥\n" +
                "जन्म जन्म के पाप नसावे। अन्तवास शिवपुर में पावे॥10॥\n" +
                "\n" +
                "कहे अयोध्या आस तुम्हारी। जानि सकल दुःख हरहु हमारी॥\n" +
                "\n" +
                "॥दोहा॥\n" +
                "\n" +
                "नित्त नेम कर प्रातः ही, पाठ करौं चालीसा।\n" +
                "तुम मेरी मनोकामना, पूर्ण करो जगदीश॥\n" +
                "मगसर छठि हेमन्त ॠतु, संवत चौसठ जान।\n" +
                "अस्तुति चालीसा शिवहि, पूर्ण कीन कल्याण॥\n" +
                "\n";
        txt.setText(s);


    }
}
