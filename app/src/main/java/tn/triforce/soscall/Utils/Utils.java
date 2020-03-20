package tn.triforce.soscall.Utils;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.HashMap;

import tn.triforce.soscall.DataModel;
import tn.triforce.soscall.R;

/**
 * Created by noure on 22/12/2017.
 */
public class Utils {
    public static HashMap dictionary;
    private static Utils ourInstance = new Utils();

    private Utils() {
    }

    public static Utils getInstance() {
        dictionary = new HashMap();

        //Tunisia
        //SOS
        ArrayList<DataModel> sosTunisia = new ArrayList<>();
        sosTunisia.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "198"));
        sosTunisia.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "190"));
        sosTunisia.add(new DataModel(R.string.TN_TNG, R.drawable.ic_guard, R.color.sos2, "193"));
        sosTunisia.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "197"));
        sosTunisia.add(new DataModel(R.string.TN_contreTerrorisme, R.drawable.ic_sos, R.color.sos5, "80 101 111"));
        //Covid-19
        ArrayList<DataModel> covidTunisia = new ArrayList<>();
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));
        covidTunisia.add(new DataModel(R.string.covidInfoNumber, R.drawable.ic_virus, R.color.sos8Corona, "80 10 19 19"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberNorthWest, 0, R.color.sos5, "78 613 213"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberNorthEast1, 0, R.color.sos7, "71 589 271"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberNorthEast2, 0, R.color.sos7, "71 589 626"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberNorthEast3, 0, R.color.sos7, "71 589 596"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberCenterWest1, 0, R.color.sos2, "76 217 608"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberCenterWest2, 0, R.color.sos2, "76 217 915"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberCenterWest3, 0, R.color.sos2, "76 217 920"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberCenterEast1, 0, R.color.sos3, "73 369 090"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberCenterEast2, 0, R.color.sos3, "73 369 393"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberCenterEast3, 0, R.color.sos3, "74 672 372"));
        covidTunisia.add(new DataModel(R.string.covidEmergencyNumberSouth,0, R.color.sos1, "75 294 529"));

        HashMap tunisiaNumbers = new HashMap();
        tunisiaNumbers.put(Constants.SOS_Key, sosTunisia);
        tunisiaNumbers.put(Constants.COVID_Key, covidTunisia);

        //Algeria
        //SOS
        ArrayList<DataModel> sosAlgeria = new ArrayList<>();
        sosAlgeria.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "041403131"));
        sosAlgeria.add(new DataModel(R.string.DZ_GN, R.drawable.ic_guard, R.color.sos2, "1023"));
        sosAlgeria.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "1548"));
        sosAlgeria.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "14"));
        sosAlgeria.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos5, "3033"));
        //Covid-19
        ArrayList<DataModel> covidAlgeria = new ArrayList<>();
        //covidAlgeria.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap algeriaNumbers = new HashMap();
        algeriaNumbers.put(Constants.SOS_Key, sosAlgeria);
        algeriaNumbers.put(Constants.COVID_Key, covidAlgeria);

        //Morocco
        //SOS
        ArrayList<DataModel> sosMorocco = new ArrayList<>();
        sosMorocco.add(new DataModel(R.string.MA_SAMU, R.drawable.ic_samu, R.color.sos1, "150"));
        sosMorocco.add(new DataModel(R.string.MA_Police, R.drawable.ic_police, R.color.sos3, "190"));
        sosMorocco.add(new DataModel(R.string.MA_GR, R.drawable.ic_guard, R.color.sos2, "177"));
        //Covid-19
        ArrayList<DataModel> covidMorocco = new ArrayList<>();
        covidMorocco.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "141"));

        HashMap moroccoNumbers = new HashMap();
        moroccoNumbers.put(Constants.SOS_Key, sosMorocco);
        moroccoNumbers.put(Constants.COVID_Key, covidMorocco);

        //France
        //SOS
        ArrayList<DataModel> sosFrance = new ArrayList<>();
        sosFrance.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "15"));
        sosFrance.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos2, "17"));
        sosFrance.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "18"));
        sosFrance.add(new DataModel(R.string.FR_EUR, R.drawable.ic_sos, R.color.sos3, "112"));
        sosFrance.add(new DataModel(R.string.FR_DEAF, R.drawable.ic_sos, R.color.sos5, "114"));
        sosFrance.add(new DataModel(R.string.FR_SDF, R.drawable.ic_sos, R.color.sos6, "115"));
        sosFrance.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos7, "119"));
        //Covid-19
        ArrayList<DataModel> covidFrance = new ArrayList<>();
        covidFrance.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "310 235 3215"));

        HashMap franceNumbers = new HashMap();
        franceNumbers.put(Constants.SOS_Key, sosFrance);
        franceNumbers.put(Constants.COVID_Key, covidFrance);

        //USA Canada MEXICO
        //SOS
        ArrayList<DataModel> sosUSA_CA_MX = new ArrayList<>();
        sosUSA_CA_MX.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos4, "911"));
        //Covid-19
        ArrayList<DataModel> covidUSA_CA_MX = new ArrayList<>();
//        covidUSA_CA_MX.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap USA_MXNumbers = new HashMap();
        USA_MXNumbers.put(Constants.SOS_Key, sosUSA_CA_MX);
        USA_MXNumbers.put(Constants.COVID_Key, covidUSA_CA_MX);

        //Canada
        //Covid-19
        ArrayList<DataModel> covid_CA = new ArrayList<>();
        covid_CA.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, " 1 877 644 4545"));
        HashMap CA_Numbers = new HashMap();
        CA_Numbers.put(Constants.SOS_Key, sosUSA_CA_MX);
        CA_Numbers.put(Constants.COVID_Key, covid_CA);

        //South Africa
        //SOS
        ArrayList<DataModel> sosSouth_Africa = new ArrayList<>();
        sosSouth_Africa.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "999"));
        sosSouth_Africa.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "10111"));
        //Covid-19
        ArrayList<DataModel> covidSouth_Africa = new ArrayList<>();
//        covidSouth_Africa.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap south_AfricaNumbers = new HashMap();
        south_AfricaNumbers.put(Constants.SOS_Key, sosSouth_Africa);
        south_AfricaNumbers.put(Constants.COVID_Key, covidSouth_Africa);

        //DEUSTCH
        //SOS
        ArrayList<DataModel> sosDeustch = new ArrayList<>();
        sosDeustch.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "110"));
        sosDeustch.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "112"));
        //Covid-19
        ArrayList<DataModel> covidDeustch = new ArrayList<>();
//        covidDeustch.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap deustchNumbers = new HashMap();
        deustchNumbers.put(Constants.SOS_Key, sosDeustch);
        deustchNumbers.put(Constants.COVID_Key, covidDeustch);

        //ITALY
        //SOS
        ArrayList<DataModel> sosItaly = new ArrayList<>();
        sosItaly.add(new DataModel(R.string.IT_rifleman, R.drawable.ic_guard, R.color.sos2, "112"));
        sosItaly.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "113"));
        sosItaly.add(new DataModel(R.string.IT_children_emergency, R.drawable.ic_sos, R.color.sos5, "114"));
        sosItaly.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "115"));
        sosItaly.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "118"));
        //Covid-19
        ArrayList<DataModel> covidItaly = new ArrayList<>();
//        covidItaly.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap italyNumbers = new HashMap();
        italyNumbers.put(Constants.SOS_Key, sosItaly);
        italyNumbers.put(Constants.COVID_Key, covidItaly);

        //TURKEY
        //SOS
        ArrayList<DataModel> sosTurkey = new ArrayList<>();
        sosTurkey.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "110"));
        sosTurkey.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "112"));
        sosTurkey.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "155"));
        //Covid-19
        ArrayList<DataModel> covidTurkey = new ArrayList<>();
        covidTurkey.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "184"));

        HashMap turkeyNumbers = new HashMap();
        turkeyNumbers.put(Constants.SOS_Key, sosTurkey);
        turkeyNumbers.put(Constants.COVID_Key, covidTurkey);

        //PORTUGAL
        //SOS
        ArrayList<DataModel> sosPortugal = new ArrayList<>();
        sosPortugal.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos1, "112"));
        sosPortugal.add(new DataModel(R.string.PT_FOREST_FIRE, R.drawable.ic_firetruck, R.color.sos4, "117"));
        sosPortugal.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos2, "808 242424"));
        sosPortugal.add(new DataModel(R.string.PT_HELP, R.drawable.ic_sos, R.color.sos5, "118"));
        sosPortugal.add(new DataModel(R.string.PT_TOURIST, R.drawable.ic_sos, R.color.sos4, "800 296296"));
        sosPortugal.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos3, "213 433333"));
        //Covid-19
        ArrayList<DataModel> covidPortugal = new ArrayList<>();
        covidPortugal.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "808 24 24 24"));

        HashMap portugalNumbers = new HashMap();
        portugalNumbers.put(Constants.SOS_Key, sosPortugal);
        portugalNumbers.put(Constants.COVID_Key, covidPortugal);

        //REUNION
        //SOS
        ArrayList<DataModel> sosReunion = new ArrayList<>();
        sosReunion.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos1, "974"));
        //Covid-19
        ArrayList<DataModel> covidReunion = new ArrayList<>();
//        covidReunion.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap reunionNumbers = new HashMap();
        reunionNumbers.put(Constants.SOS_Key, sosReunion);
        reunionNumbers.put(Constants.COVID_Key, covidReunion);

        //Belgique
        //SOS
        ArrayList<DataModel> sosBelgium = new ArrayList<>();
        sosBelgium.add(new DataModel(R.string.FR_EUR, R.drawable.ic_sos, R.color.sos3, "112"));
        sosBelgium.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "112"));
        sosBelgium.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos2, "101"));
        sosBelgium.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos7, "166000"));
        sosBelgium.add(new DataModel(R.string.BE_POISON, R.drawable.ic_samu, R.color.sos3, "070245245"));
        //Covid-19
        ArrayList<DataModel> covidBelgium = new ArrayList<>();
        covidBelgium.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "8002 8080"));

        HashMap belgiumNumbers = new HashMap();
        belgiumNumbers.put(Constants.SOS_Key, sosBelgium);
        belgiumNumbers.put(Constants.COVID_Key, covidBelgium);

        //ROMANIA
        //SOS
        ArrayList<DataModel> sosRomania = new ArrayList<>();
        sosRomania.add(new DataModel(R.string.FR_EUR, R.drawable.ic_sos, R.color.sos3, "112"));
        //Covid-19
        ArrayList<DataModel> covidRomania = new ArrayList<>();
        covidRomania.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "0800800358"));

        HashMap romaniaNumbers = new HashMap();
        romaniaNumbers.put(Constants.SOS_Key, sosRomania);
        romaniaNumbers.put(Constants.COVID_Key, covidRomania);

        //SPAIN
        //SOS
        ArrayList<DataModel> sosSpain = new ArrayList<>();
        sosSpain.add(new DataModel(R.string.FR_EUR, R.drawable.ic_sos, R.color.sos3, "112"));
        sosSpain.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "091"));
        sosSpain.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "061"));
        sosSpain.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "080"));
        sosSpain.add(new DataModel(R.string.ES_Police, R.drawable.ic_guard, R.color.sos2, "092"));
        //Covid-19
        ArrayList<DataModel> covidSpain = new ArrayList<>();
//        covidSpain.add(new DataModel(R.string.covidEmergencyNumber, R.drawable.ic_virus, R.color.sos8Corona, "190"));

        HashMap spainNumbers = new HashMap();
        spainNumbers.put(Constants.SOS_Key, sosSpain);
        spainNumbers.put(Constants.COVID_Key, covidSpain);

        dictionary.put(Constants.TUNISIA, tunisiaNumbers);
        dictionary.put(Constants.ALGERIA, algeriaNumbers);
        dictionary.put(Constants.MAROCCO, moroccoNumbers);
        dictionary.put(Constants.FRANCE, franceNumbers);
        dictionary.put(Constants.USA, USA_MXNumbers);
        dictionary.put(Constants.CANADA, CA_Numbers);
        dictionary.put(Constants.MEXICO, USA_MXNumbers);
        dictionary.put(Constants.SOUTH_AFRICA, south_AfricaNumbers);
        dictionary.put(Constants.DEUSTCH, deustchNumbers);
        dictionary.put(Constants.ITALY, italyNumbers);
        dictionary.put(Constants.TURKEY, turkeyNumbers);
        dictionary.put(Constants.PORTUGAL, portugalNumbers);
        dictionary.put(Constants.REUNION, reunionNumbers);
        dictionary.put(Constants.BELGIUM, belgiumNumbers);
        dictionary.put(Constants.ROMANIA, romaniaNumbers);
        dictionary.put(Constants.SPAIN, spainNumbers);
        return ourInstance;
    }

    public static final String getPathAssetFlag(String countryCode) {
        return Constants.ASSETS_PATH + countryCode + ".png";
    }

    public static void shareAction(String text, Context context) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        sendIntent.setType("text/plain");
        context.startActivity(Intent.createChooser(sendIntent, context.getString(R.string.share)));
    }

    public static void contactAction(Context context) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, Constants.Email_DEVELOPER);
        intent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.text_add_country_request));
        intent.putExtra(Intent.EXTRA_TEXT, "");

        context.startActivity(Intent.createChooser(intent, context.getString(R.string.contact)));
    }
}
