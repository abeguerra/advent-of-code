import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day7 {
  public static String getRootProgram(String[] allPrograms, String[] linkedPrograms) {
    Set<String> allProgramsSet = new HashSet<>(Arrays.asList(allPrograms));
    Set<String> linkedProgramsSet = new HashSet<>(Arrays.asList(linkedPrograms));
    allProgramsSet.removeAll(linkedProgramsSet);
    return allProgramsSet.iterator().next();
  }
  public static HashMap<String, Integer> getProgramValueMap(String[][] progamValues) {
    HashMap<String, Integer> valueMap = new HashMap<>();
    for (String[] programValue : progamValues) {
      valueMap.put(programValue[0], Integer.parseInt(programValue[1]));
    } 
    return valueMap;
  }
  public static HashMap<String, Integer> getParentProgramValueMap(String[][] linkedPrograms, HashMap<String, Integer> programValueMap, String root) {
    System.out.println("root -> " + root);
    HashMap<String, Integer> valueMap = new HashMap<>();
    for (String[] lp : linkedPrograms) {
      String curProgram = lp[0];
      if (curProgram.equals(root)) continue;
      valueMap.put(curProgram, programValueMap.get(curProgram));
      for (int i = 1; i < lp.length; i++) {
        valueMap.put(curProgram, valueMap.get(curProgram) + programValueMap.get(lp[i]));
      }
    }
    return valueMap;
  }
  public static void main(String[] args) {
    String[] allNames = {
      "ifyzcgi",
"axjvvur",
"tcmdaji",
"yjzqr",
"smascq",
"hyehtm",
"oylvq",
"csyiik",
"zivjpfo",
"ggfmiv",
"vpltn",
"gzxnn",
"bsfygp",
"dnrjb",
"ohdnhx",
"frcrd",
"cldaag",
"vphlxz",
"nljmcv",
"xcxqa",
"hywzja",
"ytxcti",
"igzvp",
"uzvsml",
"keusrg",
"tlmfw",
"hjmtrw",
"ahjlf",
"egszxz",
"skmuo",
"ifyja",
"dwnokzu",
"txbgfm",
"roqfxg",
"autjn",
"hnedp",
"owxawf",
"jensj",
"sglkjsh",
"eeziziu",
"qjuuu",
"iebulx",
"lhfuku",
"mxnlv",
"emtjcx",
"jspui",
"nmikggy",
"vatflrk",
"jfcoc",
"gyepcnc",
"atbiby",
"ygnkwn",
"piexct",
"uitfx",
"rdvciwk",
"jkgnvbn",
"xpewzk",
"vlqyxe",
"bmdgthp",
"czafdho",
"emuwzd",
"fwabsk",
"uftnfv",
"ndkcn",
"srzfd",
"gqhnstx",
"bdnjn",
"pbckxv",
"fbpbs",
"zwutlym",
"lzeud",
"gjctf",
"azmneyd",
"wbenaek",
"orpjw",
"dgyulo",
"qklqozd",
"waiwj",
"bnevesk",
"yqnjd",
"vvkkkpb",
"ciprksz",
"hblux",
"dfywz",
"jeiqx",
"zdissfg",
"mriqcjy",
"eydak",
"qwxwd",
"plhlj",
"nqgbp",
"ewwfzg",
"djzjiwd",
"mtflvu",
"shesfq",
"huzokb",
"ohuvsf",
"wcdibhx",
"fxlbc",
"lnknp",
"swugafb",
"pmadd",
"mprgtb",
"lorxjw",
"welidg",
"zzbad",
"dwejsn",
"fvivo",
"zuawuo",
"ikaol",
"mmhtyd",
"hujjten",
"htqps",
"dlobfkw",
"fxrijc",
"xgfad",
"pafiy",
"cblhmk",
"kioga",
"ljhlxc",
"qsvbb",
"uaffk",
"lvptmrf",
"hebhue",
"eefyyr",
"wyylpt",
"vmboh",
"ghcgz",
"jjhrmi",
"teduvv",
"xjadrfg",
"ugcccv",
"psdzpg",
"hyhbu",
"satjdgz",
"cjbdxts",
"gdunxee",
"fqswta",
"iwouvid",
"iqbdxb",
"ozbjpiq",
"ysafyj",
"lcchgb",
"wkamonm",
"waqca",
"bbeyl",
"rkfspx",
"nggtuh",
"jmypc",
"yfegso",
"zirysk",
"rtsbgwx",
"yxgwsj",
"xmgqmv",
"lncmhi",
"orclyi",
"bjwny",
"zehkwy",
"mzajj",
"ffsehyc",
"agelbfq",
"dgcecu",
"wtqxei",
"vlmihf",
"lovox",
"cmvofka",
"ttbuzrh",
"vsunxw",
"skfnp",
"upuybrd",
"cpmebw",
"wkmtw",
"rpvwtq",
"jenfafh",
"pubtxq",
"xlkwyg",
"iltoh",
"ctaazgn",
"zxhqlfy",
"dklujy",
"khgvmj",
"yfnkp",
"edsjbi",
"brtomr",
"siqcu",
"kxdehcg",
"vmkeu",
"momda",
"pocvrcs",
"sonvcww",
"nemrt",
"ldbkyg",
"jsrrt",
"ifuvyo",
"kfzqw",
"iyfyi",
"tykwy",
"twgjdmg",
"qface",
"ygkdmh",
"sblfh",
"gbldz",
"hmjpa",
"wsixz",
"vgegr",
"fggyk",
"kjoru",
"ixqrl",
"gklehu",
"xxego",
"jxfimbl",
"vymmkdf",
"jpwtbds",
"xsztla",
"wtfliw",
"lbxrh",
"ybioco",
"yvdhwyh",
"eauxeyl",
"skuazsw",
"jlcie",
"ckmftuc",
"yuikqm",
"dqbfloz",
"zofjia",
"vyvrn",
"tszockk",
"ydqqgrw",
"hcxwql",
"gjedup",
"arelp",
"aonfn",
"lsgbe",
"gunvu",
"kasaf",
"imohij",
"khwbzl",
"nwikfyc",
"khtegw",
"epggt",
"yapaib",
"saawhdk",
"qoetrb",
"ztmmr",
"uqfbnlo",
"sgrhs",
"hqjinj",
"vmpnccn",
"vqddcl",
"yffeit",
"xvzinl",
"znzbkh",
"gnjit",
"qojhhod",
"aluqao",
"ipysrdj",
"worqh",
"tsxfibs",
"pcumn",
"mejwrm",
"aynpyne",
"sikmtaj",
"sbfprua",
"wwofru",
"nmuxe",
"uuvtlk",
"rqisvrh",
"ehjjbu",
"cbmqx",
"naekrk",
"cvnrr",
"pwnqyt",
"sagyrje",
"efuysje",
"pzwtjfj",
"ggmhxx",
"bhfui",
"chlpx",
"hmlbrz",
"oneoorw",
"kyfuyaf",
"kiylza",
"fghxbc",
"qgxgzo",
"cubqfzc",
"lcqfe",
"xypffi",
"qntzr",
"mkjuq",
"dhtii",
"amtqhf",
"ixknk",
"iuapj",
"khtooum",
"aecsfp",
"fcdcdh",
"junfev",
"pxfrz",
"xratfed",
"gwbfat",
"cvcblhv",
"sdfvrod",
"xkfkucf",
"okkvefs",
"dgosy",
"yhvndwy",
"pefzsea",
"xaogy",
"nvpdisw",
"lmkwafp",
"cwnvk",
"phbtrm",
"mrmbyj",
"jibemf",
"tysdkgl",
"fpuscxk",
"ejkumeu",
"uijgiu",
"cjjynt",
"nobfn",
"svanha",
"nuxxmd",
"vsaejz",
"hbbpuc",
"tbley",
"bkkwe",
"tywzxwb",
"ezqeusd",
"qwcyozf",
"xpwxo",
"layqazp",
"hwdtvvc",
"pwnxw",
"jobwpao",
"wrhnq",
"amsfvm",
"dfxjjzr",
"cnwzxpy",
"kpvbt",
"ifbhg",
"cpeonw",
"rsizei",
"gmkvgf",
"bjiuus",
"bwpeux",
"szrkuzi",
"ygvpk",
"mjtji",
"rqvvv",
"pozua",
"hmjueiq",
"hdxrbzc",
"twway",
"jocmdmv",
"lacddy",
"lsxjl",
"edotax",
"gmirjhi",
"iwicpur",
"uigcn",
"ynhvfvx",
"ugavy",
"jbgxcj",
"zdglrh",
"lmlsog",
"sazbmjz",
"ymeoz",
"hhqmsd",
"ykmfoah",
"lfdefc",
"qynrx",
"znely",
"cauig",
"gvamhux",
"hqqingt",
"fiynt",
"tyysd",
"igkrktn",
"pzbxpou",
"dllzp",
"iblvki",
"vaovit",
"tcpduh",
"btpvxq",
"xxnpoe",
"sboms",
"whvvemg",
"ljjyy",
"qvdid",
"koxnez",
"elgtk",
"wesoooi",
"tiikt",
"eadvs",
"sreke",
"clqqyi",
"kuufl",
"qswoy",
"rakfg",
"zvgsa",
"gskveo",
"clbbi",
"ilcsp",
"blnwcb",
"udaitd",
"aewmad",
"tvdsktm",
"zavcu",
"gglxj",
"jmrlaxf",
"sppxnti",
"zhdioii",
"olepfo",
"ezsnmw",
"hsmjm",
"xmuxsr",
"kmvcmg",
"zuoeh",
"sqxrad",
"vrbcn",
"ibevwow",
"rqilp",
"ojfzokk",
"bjwvw",
"sygjhzp",
"pjvnmqn",
"qqjly",
"iezyfwf",
"wrlkfij",
"wuvhyc",
"aqgtml",
"fhjysp",
"rmlru",
"bdiiv",
"tlxekcp",
"lbozpy",
"uksnrfx",
"gmuwpyi",
"zsqzm",
"evhhfo",
"xdyrvy",
"gbxxpd",
"nzhqepw",
"zfteizz",
"ulragq",
"jgrsa",
"uisnk",
"chyhykz",
"zjveu",
"syliku",
"syzcti",
"nnmayb",
"zdqmuey",
"myopc",
"cifdyio",
"nguafeb",
"dbczwnr",
"vxede",
"ouhuptm",
"sdyox",
"slahk",
"skbrota",
"hbaxtai",
"hvdfq",
"zgfqdv",
"dpqxfp",
"arskvgv",
"bqywl",
"ymataqq",
"krwgy",
"ohsyhln",
"ofqbu",
"ccpnopa",
"bfkbp",
"bolpsk",
"tckyc",
"qbftkij",
"bpcnzi",
"rhacrz",
"wzbqh",
"qqnmzb",
"tuvehcz",
"yzufk",
"xsmyok",
"tgiou",
"izvtqsa",
"ooufod",
"rfwaq",
"lpoejf",
"oykwsk",
"wdipy",
"jbnns",
"qcxiehu",
"vsslzfp",
"uimoc",
"phtghp",
"svthizp",
"xvwvc",
"ovpzt",
"uatlbrq",
"hmpisyb",
"pehflc",
"iedfk",
"nomeb",
"ffuqr",
"gsgwqk",
"igqle",
"jhcwkl",
"yfusbw",
"lpsafeq",
"lklqxg",
"lofayaa",
"itqwz",
"xbidr",
"pnouux",
"ryazls",
"bxwng",
"xwkyrer",
"nbmnwsq",
"cxfsoh",
"gdylf",
"vksyy",
"qekxzsx",
"qzglav",
"xsoqzbe",
"lndczw",
"perzy",
"oigsk",
"uytsra",
"zszzkl",
"wfvjnxf",
"pklcmix",
"cvpuwrb",
"ileugiu",
"defbun",
"fbzvm",
"aduikk",
"shlfz",
"yhjhgu",
"vgiqvsi",
"iajts",
"kxwbdvm",
"rynmge",
"bqxnoid",
"kqqsq",
"xrunic",
"vqnyvr",
"lvdrrk",
"bamxvq",
"xkzvo",
"vhoasjq",
"hkgxpgh",
"zocwx",
"qhyfphs",
"coselm",
"ypbrxyq",
"ffgzg",
"ujuunj",
"iuchai",
"ykvss",
"ovszp",
"helyfoo",
"pryhgj",
"fxhqq",
"eeshl",
"qzftgbx",
"ppcsoo",
"xinfpy",
"ddraicf",
"xidtz",
"ipsst",
"wzvzgg",
"fqqyipa",
"jpyvpw",
"xhzyzer",
"boszym",
"kabqu",
"sdpsl",
"bekguie",
"klovr",
"zklbfdg",
"ccter",
"wzqanwj",
"uxbrs",
"dzxpqj",
"csrww",
"wwxak",
"etfbuu",
"miwst",
"iiugq",
"cuprzhk",
"waakcx",
"faijmsh",
"cvlod",
"sjgvkg",
"ixxww",
"mipqe",
"xitcp",
"lxudoaz",
"ibkfqok",
"ulchkal",
"qubli",
"tsamaj",
"mmpnppi",
"prlvn",
"ddwursx",
"aljgr",
"glkjrrs",
"vwftcva",
"ylbaxtu",
"jqpdpr",
"yzhvrx",
"iqoxkhd",
"locrtxl",
"fbmajm",
"rylaxjf",
"wyois",
"ecwjaw",
"alhlvth",
"jlofqwz",
"sdktm",
"bjvuicy",
"hepkop",
"gqbwc",
"yojcz",
"obwkzhc",
"cdqdm",
"gjcibb",
"igdtz",
"phsmt",
"hdjzg",
"jukxlr",
"oajdx",
"ktayld",
"dkxzsaq",
"utewfcr",
"jljjai",
"gnughzp",
"oyienb",
"kqicqf",
"ggvwlp",
"vlbivgc",
"kczlit",
"mblvpm",
"wehdeq",
"fegaac",
"qpsirr",
"gisiv",
"xjkquk",
"rsdub",
"gzxddd",
"oxsewk",
"ahfdt",
"wafjqj",
"mhjeza",
"bljkg",
"fkapr",
"dtfdn",
"zxgrq",
"rlfqf",
"hvisx",
"laopkn",
"zvszwl",
"gorpw",
"skmbdhz",
"ecaiau",
"bfwnv",
"uhvtpfy",
"zafggcz",
"qkrpzl",
"bvmgrs",
"iicpkf",
"rbuwrpw",
"funnv",
"flkkr",
"brzucfh",
"lfavcfd",
"dmvcduz",
"izdhn",
"hrnrjrt",
"eiatt",
"czvyrzi",
"ypkhqlq",
"egxzjn",
"qzzlmw",
"xepgx",
"iftyxdd",
"rskara",
"uytsdd",
"mqodhde",
"ylqvuk",
"gisrnfs",
"vntsex",
"rwmdbn",
"fhhgts",
"opdtk",
"beewze",
"leyikdx",
"kcbwrrr",
"jwhcmc",
"mqcflzv",
"ofwbsgp",
"hiyswbt",
"armfpvt",
"zsknxq",
"pewxc",
"lhmgw",
"qwmqci",
"hioofm",
"cujimpt",
"htstksc",
"quwfos",
"tcjqw",
"orbcuzi",
"sybpg",
"qyhvc",
"sadnqcp",
"zihpcn",
"zxygs",
"gyoqtcg",
"emwblax",
"hewatw",
"qxkvfid",
"kglsx",
"yhfpq",
"zivlnu",
"xsyzhcf",
"howlyws",
"uycop",
"yhxlzc",
"isqvoex",
"bklfmch",
"tvrxaw",
"lkreb",
"kxyfb",
"jnrnwos",
"mxbrva",
"qkhqrq",
"gfhummb",
"zwzzce",
"rrvbwb",
"enlctw",
"yeaic",
"otipr",
"qxkhq",
"wbqeo",
"iugsida",
"azuoza",
"yxemuyq",
"fyouz",
"bnlbs",
"hilafgl",
"shdgsk",
"rnqgy",
"kmwxj",
"hmmjjct",
"mefmo",
"lwvfsu",
"fixwkec",
"haclvfu",
"werkz",
"iovxjv",
"dmglcj",
"qprenhy",
"qmwmbsk",
"zywvdda",
"ntkpthi",
"jkkqxfr",
"muptknj",
"uwnwp",
"ggwtf",
"afywb",
"xglsp",
"elovaun",
"qhubjd",
"exwzzr",
"xhhwwso",
"uevxbyn",
"pqgiox",
"edjlm",
"ypdumo",
"ehhbjt",
"cxyfam",
"bhqlq",
"abamn",
"sjdanf",
"wcjnjpf",
"xzvln",
"citaywz",
"aqtog",
"khdbe",
"vksnq",
"fkwbo",
"jefjzvl",
"azoutv",
"aqvtgi",
"vlyof",
"gwyljq",
"xmedt",
"rsstvn",
"vekxdqh",
"toeyz",
"pvyvx",
"pwmrau",
"qahzrif",
"gzjut",
"mzyqoc",
"tkdvenx",
"vtefqb",
"yekmflj",
"pdbykx",
"fpgyyu",
"qjbbyb",
"izzzyqd",
"lsire",
"vbuvkx",
"ahqfu",
"cjxyp",
"aeatvub",
"jhnujj",
"cxpwfir",
"gcydgf",
"zlbnkdc",
"lrjbgd",
"casmwo",
"rqqlzs",
"xtqthxs",
"kjonvut",
"mptovq",
"dwrwuoq",
"ziiqv",
"vnfigul",
"jpynea",
"rplcrt",
"flptbw",
"nojly",
"jbqmy",
"ozhydny",
"zzflc",
"jktlfu",
"njvkdrp",
"qyurm",
"bjyraf",
"zhpfgzv",
"qfcetm",
"dhfagjw",
"qriyeb",
"ucaee",
"djvkd",
"scqtkga",
"yvgkdi",
"zsukqjo",
"hfmaqp",
"gxsxqwt",
"marord",
"uloppmh",
"iktmpdq",
"wnvrg",
"cxiturs",
"fewrzd",
"swnan",
"xdojlm",
"dhtxpbb",
"roogi",
"yffhk",
"ffinat",
"txrfl",
"eoustfr",
"bxmcg",
"kdeqm",
"lfsvtih",
"qkhvu",
"zzfcq",
"kebhn",
"ljmrml",
"asozcan",
"ceeotg",
"fonrd",
"fvmeeas",
"cejtpyf",
"wsvfkr",
"evdwf",
"wqgssb",
"uhnqr",
"xzmdis",
"tafhilv",
"mhpzrw",
"cgrima",
"nrwmjk",
"yjutt",
"cxcyrd",
"fwwub",
"sapwhr",
"ihzsljz",
"zmkwnv",
"yytpewc",
"xdctkbj",
"kptjhtd",
"pcecbrn",
"sdwrx",
"dfiyju",
"gxddhu",
"zvpboy",
"fndyvvn",
"ozvtqp",
"kxizh",
"zwzxy",
"rkjuz",
"jagdwg",
"rutqzk",
"zymggc",
"afbzsz",
"ymdmn",
"twoyl",
"lqcutyt",
"nlacdac",
"otikjx",
"rxzfdg",
"huvihu",
"cfbaj",
"lqlyf",
"apxgf",
"nqicerc",
"iksaub",
"avyoy",
"kzzfvt",
"uqeag",
"crhojk",
"oxoocfp",
"aylxc",
"khnjt",
"ytvjxq",
"xkxqc",
"ogmoqb",
"nvfca",
"xaycmtu",
"kklbcs",
"wqtuhe",
"unqui",
"vhkydm",
"zcomxf",
"hsxhyf",
"rwakmo",
"uogva",
"cesnj",
"rtcfcyn",
"qckzqv",
"oixlcn",
"iaoyb",
"idrror",
"bcldmsg",
"lbxdtms",
"adbxp",
"qsjqlp",
"mjumixz",
"rtmiw",
"jzmacb",
"umgch",
"rpjozji",
"xvayjwv",
"vgemekb",
"odpqjr",
"hekibe",
"xmaqelf",
"ivlus",
"rkwhbhr",
"pawvr",
"crcrimv",
"ukfsn",
"nfcbi",
"qwfvm",
"jfieeor",
"eolqn",
"bgehlas",
"ruozk",
"gqikhhw",
"pqjua",
"jtyurkp",
"wjbdxln",
"paopwt",
"fefuzon",
"ifualyn",
"npccgnv",
"nvcafwu",
"htecpc",
"uxbhu",
"gzfrn",
"qlwhsix",
"uvkxner",
"kmfel",
"ytiljvt",
"cxqeyt",
"yyursb",
"mpijr",
"rpqbv",
"oginzo",
"sydjg",
"ehlnex",
"ukqmhyc",
"gshsx",
"nafrmeo",
"ifwmfdm",
"rmexd",
"ujbzq",
"scxdo",
"bvmgt",
"vkaay",
"pxdkes",
"witry",
"ttpmzgm",
"pxgkg",
"vwojto",
"jcise",
"tbioyr",
"wnpnfiv",
"ejxib",
"htpblzv",
"dgdtt",
"weyfsg",
"aodoc",
"vmeubf",
"pwetqid",
"pudso",
"ibjdru",
"rtgobsq",
"kqiuy",
"gfszte",
"ngxtfhu",
"fphmu",
"yxzlpnj",
"khixdho",
"pjjmau",
"ttofoep",
"fhycptc",
"nsghrq",
"hmdxion",
"nsbzfgy",
"hngao",
"iitbuxz",
"ywnsmem",
"qjsvs",
"uuyfecv",
"uafhv",
"aocfuj",
"kaghlc",
"eionkb",
"hzhcl",
"ssnhc",
"ttfyrk",
"nvfqmkw",
"qrrvi",
"ajcbzv",
"ydiicdl",
"eyxccr",
"gdkjoit",
"urktg",
"wuclmu",
"rosfnb",
"osjsm",
"kgoyufq",
"kihqh",
"xjyyfe",
"gyfbgkr",
"bidhw",
"wfpzhfz",
"rnyndr",
"xqncgyu",
"hvmlb",
"txwzysl",
"suuhqpd",
"djviima",
"ddguar",
"wptyd",
"obbpd",
"anoxh",
"llgbz",
"mhxheb",
"yybnbso",
"lxgvhy",
"yffpvf",
"ttvfha",
"tocvooe",
"taxrkif",
"rvixnmq",
"uhwnr",
"djvfa",
"rjmuly",
"pnhpv",
"sjaax",
"amtayi",
"vbmyyrh",
"gomcbqb",
"oijwjli",
"wajnseu",
"hghjsk",
"dzqqgbm",
"guvke",
"jpvxzcn",
"mplhwo",
"dblmcye",
"ahbcl",
"liznr",
"pwoyfeh",
"jdiczst",
"ejvipa",
"oherzyz",
"kivyltn",
"szcmb",
"ofxzyhr",
"xmzzrgs",
"gdrxgji",
"ziyyc",
"wgqpt",
"yykkph",
"yoxetv",
"xqpfvwx",
"fxaglf",
"shjxje",
"cdlzi",
"zytau",
"ghakp",
"lbhlxqa",
"bchixdc",
"olhnx",
"bvypab",
"hregcx",
"aucjw",
"bmqhvfv",
"fpfpv",
"lzypz",
"ujjoydl",
"rfcbs",
"cmdizw",
"iiqzvha",
"zdqsmv",
"neywe",
"teyakvf",
"inlrm",
"kpayh",
"spwqxpy",
"ofnewz",
"knqxdq",
"jtfylv",
"jhyjqxq",
"kmfsmp",
"kskts",
"hktzoq",
"tajfmq",
"zdxscz",
"pywmbis",
"yhsmjfq",
"kzkfcn",
"mieqti",
"mxwbp",
"thrvlt",
"wqoae",
"yivjj",
"aumrixf",
"gfigt",
"cepxc",
"vzxktth",
"locto",
"vopqzha",
"lxwvf",
"zuwaw",
"oothjv",
"tubhp",
"wywxu",
"uwjowb",
"pwzsq",
"eexmf",
"ldgyqh",
"ewswf",
"tbaads",
"rxsihsa",
"dtmbf",
"tzhwvzt",
"qivxs",
"nfucnzx",
"znwmvr",
"kejtzg",
"eukgf",
"skpux",
"uewdyd",
"dnynny",
"guyrnpn",
"lnmhw",
"llkaoeh",
"ydzibri",
"gaashgh",
"vbmqj",
"uqmgmst",
"tijwlva",
"fozagvz",
"tafss",
"dckbvlg",
"oncexf",
"jkkwtd",
"evqibrc",
"mrwbv",
"hrokzl",
"soirl",
"ubuge",
"rtutzu",
"pmefov",
"tnqram",
"dzfclsm",
"pjazwiy",
"mnqii",
"uqjfarv",
"xnxsdq",
"lnwcryv",
"lovaf",
"rhcxf",
"evcveie",
"lyhlx",
"zjzgs",
"brjgwq",
"wnfqsa",
"balknnd",
"ayqbj",
"zynpp",
"szglq",
"ocppbp",
"wuknah",
"ifnkl",
"eqkot",
"yjrfr",
"cvdows",
"lybaepp",
"jxaorvd",
"zkpfzio",
"evbtz",
"srnnjbb",
"viqvtzw",
"nsnqedk",
"wiapj",
"jhwrcb",
"zdnypzo",
"eqpuuzs",
"kevlq",
"fxpoal",
"dlfmj",
"pbkplz",
"qdqtw",
"qkicc",
"axgndac",
"gptyqwd",
"cwkdlil",
"tmoui",
"xxmtvr",
"zijzutq",
"xtaoisd",
"szcozjr",
"jfhqrla",
"nsbnixe",
"haqaohl",
"eeune",
"vgexqw",
"ghapm",
"swcvn",
"lmhamlz",
"louebj",
"fjcobs",
"holen",
"qryui",
"olhfbr",
"wcmyn",
"dkmkdfd",
"odqns",
"xwjmsjr",
"rqrhrnz",
"uamqx",
"rkwquj",
"ncmad",
"lefxyzt",
"qcmnpm",
"kgqzrt",
"ttoer",
"rahgf",
"mdqeh",
"ghdbwu",
"thbwh",
"gfjsie",
"mmfuve",
"vzcklke",
"bffnszc",
"saddwx",
"bmnsmqz",
"qkawtfu",
"edlved",
"pxgcbfi",
"gekygl",
"egtruqh",
"rvpxob",
"ympbbx",
"pxkypf",
"qqllir",
"tehat",
"gibdxij",
"itlwpm",
"rfknc",
"ekvdv",
"gwqgewp",
"cvnabd",
"dskuj",
"yqgesx",
"vljjqbw",
"qmati",
"afyxhh",
"ubxvdq",
"ckegba",
"sysdxvb",
"nihiexp",
"myqre",
"nwupf",
"tzrqqk",
"pwvahdb",
"gcowt",
"ohsvn",
"zhohes",
"ripilxo",
"vwvowk",
"bmlkhaf",
"kztkif",
"ycpcv",
"zyfwjxs",
"esphpt",
"jsmde",
"zguzlx",
"pcckqq",
"hxmcaoy",
"taacpu",
"ilhib",
"myookpi",
"olrgu",
"swnafht"
    };

    String[] linkedNames = {
      "wjbdxln", "amtqhf",
"witry", "cvlod",
"lcchgb", "bhqlq",
"mqodhde", "djvkd",


"tgiou", "lndczw",

"orbcuzi", "teyakvf",


"znely", "rtsbgwx", "hilafgl",





"pehflc", "lefxyzt",
"cblhmk", "zzflc", "xsztla", "iitbuxz", "tckyc",
"ejvipa", "xhzyzer", "pzwtjfj",

"rxsihsa", "vsslzfp",
"rvixnmq", "aumrixf", "wbenaek", "jkkwtd", "ywnsmem", "mmhtyd", "xmzzrgs",
"xinfpy", "lwvfsu",

"wrhnq", "rskara",


"twoyl", "sikmtaj", "lvptmrf",




"mqcflzv", "nafrmeo",
"syzcti", "ynhvfvx", "ckegba",


"chlpx", "xjkquk", "afyxhh",

"uxbhu", "gekygl", "xdyrvy", "wesoooi", "esphpt",


"aqtog", "qjsvs",






"rosfnb", "vphlxz",
"kyfuyaf", "tzrqqk",

"ifyzcgi", "edotax",


"mkjuq", "ghcgz", "cxpwfir", "lxwvf", "nsghrq", "vyvrn",

"xmedt", "brzucfh", "layqazp",




"igkrktn", "oixlcn",


"gdunxee", "vgiqvsi", "bmlkhaf",


"otikjx", "wuvhyc", "dwejsn",

"dmglcj", "blnwcb",













"zszzkl", "hrnrjrt", "hjmtrw",

"ohdnhx", "uhnqr", "zdglrh", "ripilxo", "gfszte",
"mnqii", "mieqti",

"xvwvc", "ncmad", "jkgnvbn",
"mdqeh", "kmvcmg", "sonvcww", "pcckqq",

"ryazls", "vmkeu", "fewrzd",




"npccgnv", "yqnjd",

"worqh", "yjzqr",
"jktlfu", "uhvtpfy", "ivlus",

"yekmflj", "nmikggy", "xepgx",




"zivlnu", "ipsst",
"dhtxpbb", "dgcecu",
"ggmhxx", "tysdkgl", "rrvbwb",







"oneoorw", "cfbaj",

"tajfmq", "yzufk",
"qhubjd", "uycop",


"wehdeq", "gyepcnc",

"sblfh", "ekvdv", "iicpkf", "xidtz",















"yhsmjfq", "jzmacb", "autjn", "werkz",

"cbmqx", "hvmlb", "rsstvn", "jtyurkp", "gmkvgf", "qkawtfu", "ggwtf",






"nljmcv", "waiwj",

"iuchai", "qynrx",

"afywb", "dqbfloz",




"pdbykx", "dnynny", "pqjua", "jhnujj",

"dnrjb", "rfknc", "bbeyl",







"hywzja", "pywmbis",















"zvszwl", "utewfcr", "dtmbf",






"gglxj", "fqswta",
"xitcp", "jpynea",
"elovaun", "uijgiu", "apxgf", "nlacdac",





"sazbmjz", "piexct",

"nvpdisw", "kioga",
"ofqbu", "sboms", "obbpd", "czafdho",
"zwutlym", "qntzr",
"cmdizw", "qxkhq", "nfcbi", "rtutzu",



"xpewzk", "hdxrbzc", "vsaejz", "pudso",



"khixdho", "ihzsljz", "uvkxner",


"gshsx", "ntkpthi",
"lrjbgd", "vwojto",
"ctaazgn", "gqbwc", "wcdibhx", "cujimpt",

"lpoejf", "cmvofka",


"kzkfcn", "eefyyr",




"zlbnkdc", "ljmrml", "roqfxg",



"gunvu", "ymdmn",
"vwvowk", "ilcsp", "vatflrk", "iajts",

"ypkhqlq", "uitfx",

"zymggc", "wnvrg",
"skuazsw", "ewwfzg",
"bidhw", "qriyeb", "xsyzhcf", "ehjjbu",



"swnan", "tbioyr",
"dhfagjw", "xxnpoe",
"sjdanf", "hmjpa", "szglq",
"lyhlx", "ouhuptm",


"yfnkp", "edjlm", "txbgfm",
"qwcyozf", "dskuj", "anoxh", "dkmkdfd", "fkapr",
"oxsewk", "zsknxq",






"bvmgt", "gbxxpd", "ffinat", "ympbbx", "uimoc", "shesfq",

"bnlbs", "psdzpg",


"zijzutq", "yvdhwyh", "vbmyyrh",


"oyienb", "ozbjpiq",
"fhhgts", "cepxc", "zwzxy",






"fozagvz", "wqgssb", "kqqsq", "oijwjli",

"qwmqci", "dmvcduz",



"jdiczst", "edsjbi",
"kfzqw", "lbozpy",


"gzfrn", "wqtuhe", "fndyvvn", "zjveu", "iebulx", "agelbfq",







"jbnns", "glkjrrs",
"lcqfe", "uigcn",
"skbrota", "pwvahdb", "odpqjr",
"fpuscxk", "zhdioii", "gzxnn", "koxnez",



"ixknk", "ykvss", "hujjten",


"tvdsktm", "pwzsq", "plhlj", "ayqbj",
"hmmjjct", "xzvln",


"mrwbv", "llkaoeh",
"ypdumo", "lvdrrk",
"xypffi", "nvcafwu", "cvdows",

"rkwhbhr", "axjvvur",


"lybaepp", "eolqn",

"thrvlt", "ziiqv",
"nvfca", "nojly", "nguafeb",

"lbhlxqa", "dklujy", "vzxktth",

"igzvp", "vtefqb",




"pqgiox", "uloppmh",

"nqgbp", "bcldmsg",
"udaitd", "sdktm",





"tykwy", "dlobfkw", "aynpyne", "vaovit",



"saawhdk", "svthizp", "abamn",

"pzbxpou", "rxzfdg",
"vljjqbw", "hmlbrz",


"orclyi", "hmdxion",










"csrww", "haqaohl", "gskveo", "qoetrb",


"lbxrh", "lsxjl",




"qcmnpm", "yjutt", "yqgesx",




"cjjynt", "lzeud", "wyylpt", "pewxc", "ibevwow", "fvmeeas", "uksnrfx",






"urktg", "ifnkl", "hbbpuc", "casmwo", "ylqvuk", "dblmcye", "zvpboy",


"tafss", "vnfigul",


"bolpsk", "pefzsea",

"pmadd", "welidg",

"ofnewz", "neywe", "qklqozd", "ykmfoah",


"aonfn", "cgrima", "lhfuku",
"bklfmch", "xpwxo", "eoustfr",
"fiynt", "opdtk", "qkhvu",



"pafiy", "phbtrm", "nwupf",












"bjiuus", "qqjly",

"hbaxtai", "pmefov", "zfteizz",
"marord", "jbgxcj", "xsmyok",

"cvnabd", "pbckxv", "xrunic", "ezsnmw",
"quwfos", "vekxdqh",


"hsxhyf", "knqxdq",
"azoutv", "jwhcmc",




"wywxu", "tiikt", "uwnwp",
"czvyrzi", "nbmnwsq",




"bkkwe", "sbfprua",



"wyois", "cwkdlil",
"rynmge", "hngao", "vlqyxe", "jhyjqxq",

"ytvjxq", "vhoasjq", "fwwub", "xglsp", "cubqfzc", "nfucnzx",

"ukfsn", "kptjhtd",
"tbley", "eqkot", "tlmfw", "gnjit",

"qhyfphs", "bfwnv",



"ibkfqok", "lhmgw",








"toeyz", "gjcibb",
"zynpp", "ylbaxtu", "rfwaq",
"imohij", "pwetqid",



"ooufod", "clqqyi",

"dllzp", "xqpfvwx",





"dzfclsm", "sqxrad", "qkrpzl", "ppcsoo", "rqvvv",
"rtcfcyn", "vlmihf",


"xratfed", "fjcobs", "enlctw", "pklcmix",
"mzyqoc", "soirl", "dhtii", "ahbcl",






"nmuxe", "ttofoep",




"eeune", "gbldz", "ztmmr",

"crhojk", "ejkumeu", "lovaf", "fhjysp", "uxbrs", "qbftkij",
"rpjozji", "swnafht", "swugafb", "guyrnpn", "evbtz", "hyhbu",
"saddwx", "olhnx", "uisnk", "iuapj", "btpvxq", "iovxjv",

"dfywz", "emtjcx",

"igdtz", "lnmhw", "ttpmzgm", "dkxzsaq",

"ydqqgrw", "bdiiv",
"mmfuve", "lxudoaz",

"ddraicf", "dgyulo",






"rhacrz", "keusrg",
"pozua", "gisiv", "skpux", "tcmdaji", "gorpw", "yfegso", "waakcx",

"zhpfgzv", "rvpxob",

"srnnjbb", "qcxiehu", "gqhnstx", "ghdbwu",


"jlcie", "hewatw", "sdpsl",
"wfpzhfz", "phsmt", "zuwaw",

"ubxvdq", "aqvtgi",
"llgbz", "itqwz", "yxzlpnj",



"hkgxpgh", "gzxddd",
"ifyja", "cdqdm", "rwmdbn", "exwzzr", "leyikdx",





"vgexqw", "cejtpyf",
"kmfel", "paopwt", "hdjzg", "qckzqv",
"swcvn", "obwkzhc", "pcumn",


"izzzyqd", "fegaac", "jagdwg", "mblvpm",
"mzajj", "ubuge", "ddguar", "znzbkh",
"ecwjaw", "zdqsmv", "aodoc", "pxfrz",
"aqgtml", "qprenhy", "upuybrd", "sgrhs", "flptbw", "mxwbp", "boszym",




"zywvdda", "ygnkwn", "taxrkif",

"uogva", "tuvehcz",




"siqcu", "kqicqf",










"gwqgewp", "lsgbe",


"azuoza", "coselm",


"eeshl", "cxqeyt", "qkhqrq",

"pawvr", "dckbvlg",
"rqrhrnz", "beewze", "evqibrc",



"kihqh", "wafjqj",


"zavcu", "hsmjm",
"qekxzsx", "odqns",


"vbmqj", "ugavy",





"rwakmo", "nwikfyc",

"cldaag", "bjwvw", "dpqxfp", "dgdtt", "ujbzq",







"axgndac", "vbuvkx", "uqeag", "qyurm", "lzypz",


"sdwrx", "jtfylv",



"frcrd", "shjxje",

"viqvtzw", "twway", "zwzzce", "hqjinj", "mejwrm", "yyursb", "gfigt",

"xsoqzbe", "oxoocfp", "ndkcn", "vmeubf",

"ojfzokk", "iksaub",


"zirysk", "orpjw", "zdxscz",


"xjyyfe", "rahgf", "qqllir",
"xkfkucf", "xbidr", "yvgkdi",
"ytxcti", "qubli", "cpmebw", "wzvzgg",
"rkjuz", "rmlru",
"vksnq", "tijwlva", "szcozjr", "krwgy", "pnhpv", "ydiicdl", "kskts",
"wnfqsa", "jbqmy", "hvdfq",


"jqpdpr", "bmnsmqz",



"skfnp", "xwjmsjr",


"fhycptc", "olepfo", "armfpvt",




"xcxqa", "aeatvub", "pwmrau", "rqisvrh", "hepkop", "ogmoqb",

"fbmajm", "ofwbsgp",

"ffsehyc", "sapwhr",

"hmjueiq", "unqui",







"yivjj", "cxcyrd", "lorxjw",
"wwofru", "weyfsg", "khtooum", "ohsyhln",






"jnrnwos", "rsdub", "uaffk",
"scqtkga", "xdojlm",
"rakfg", "ddwursx", "nsbzfgy",



"kjonvut", "clbbi",

"vhkydm", "htecpc",

"cdlzi", "fpfpv", "bqxnoid",




"uytsra", "xxmtvr", "bljkg",
"kuufl", "khwbzl", "tocvooe",
"gfhummb", "jsmde",



"szrkuzi", "cpeonw",

"xmaqelf", "htqps",

"hyehtm", "zdissfg",

"shdgsk", "fcdcdh", "kiylza", "arskvgv",


"xmuxsr", "bfkbp", "ibjdru", "ttvfha", "zhohes",



"ewswf", "gaashgh", "cwnvk",
"wzbqh", "sysdxvb", "huzokb", "ifuvyo", "ghakp", "rqqlzs",



"ileugiu", "suuhqpd", "yffhk", "htstksc",


"rmexd", "wkmtw",



"ovszp", "zsqzm",
"wsixz", "egszxz", "gzjut", "rutqzk",



"sdyox", "dwrwuoq",


"jukxlr", "louebj",
"njvkdrp", "hqqingt",





"cxyfam", "mjumixz",


"gwyljq", "xhhwwso",




"qdqtw", "qpsirr", "dbczwnr",






"ahqfu", "gjedup", "evhhfo", "rpvwtq",
"wcmyn", "haclvfu",


"gdrxgji", "fonrd", "wqoae",
"ixqrl", "jsrrt",






"hmpisyb", "ktayld", "yapaib", "bmdgthp", "qzzlmw",









"uhwnr", "ypbrxyq", "dfxjjzr", "pxkypf", "nobfn", "tkdvenx", "sdfvrod",

"cxfsoh", "mrmbyj",
"tmoui", "amtayi", "wgqpt", "xaycmtu", "kztkif",


"nomeb", "fbzvm", "gklehu",


"vkaay", "kxdehcg",

"ljhlxc", "htpblzv",


"bchixdc", "fphmu", "hcxwql",

"ucaee", "yuikqm",






"tsamaj", "qojhhod", "kcbwrrr", "ttfyrk", "qqnmzb", "tyysd", "sjgvkg",
"ldbkyg", "brtomr", "qwfvm",





"vqddcl", "ezqeusd",







"bpcnzi", "cvpuwrb",



"roogi", "ajcbzv", "pwnqyt",


"yxgwsj", "fwabsk",
"sppxnti", "lncmhi", "jmrlaxf", "qmati",





"djvfa", "qrrvi", "junfev",
"locrtxl", "shlfz", "ycpcv",
"tlxekcp", "pxdkes",


"hghjsk", "vksyy", "otipr",

"mhpzrw", "txwzysl",

"lfavcfd", "lkreb",

"nsbnixe", "vntsex",
"lfdefc", "isqvoex",








"xmgqmv", "ciprksz",

"zxhqlfy", "ehhbjt",

"rnyndr", "eiatt", "fvivo", "gdylf",


"eauxeyl", "nrwmjk", "qxkvfid", "rjmuly",


"iqoxkhd", "gptyqwd",





"pjvnmqn", "kgoyufq", "zivjpfo", "amsfvm",







"ttoer", "jpwtbds", "yykkph", "yffpvf", "ahjlf", "yoxetv", "okkvefs",
"efuysje", "olrgu", "rtmiw",



"cesnj", "wsvfkr", "hzhcl",
"jfcoc", "vpltn",
"avyoy", "tywzxwb", "zuawuo", "vsunxw",


"epggt", "gfjsie",
"qjbbyb", "ikaol",
"aylxc", "bekguie",

"balknnd", "iiqzvha", "kzzfvt", "ecaiau",
"iktmpdq", "sreke", "cjbdxts", "ehlnex",
"fxhqq", "ybioco",



"wdipy", "khnjt", "kmwxj",

"liznr", "yytpewc",


"oncexf", "jeiqx",
"yhjhgu", "vqnyvr", "taacpu",


"xvayjwv", "eyxccr", "xtqthxs", "qzftgbx",

"jocmdmv", "iaoyb", "aecsfp", "mxbrva",

"defbun", "wcjnjpf",




"zuoeh", "tnqram", "funnv", "zzfcq", "xwkyrer", "cxiturs", "phtghp",




"itlwpm", "bdnjn",
"txrfl", "egxzjn", "iwouvid", "cjxyp",
"khtegw", "aocfuj", "mipqe", "lnknp",

"yojcz", "uafhv", "wnpnfiv", "kivyltn", "jxaorvd",


"ytiljvt", "smascq",


"vzcklke", "ggvwlp",













"aluqao", "oherzyz", "dwnokzu",
"prlvn", "xtaoisd",
"yffeit", "yfusbw", "oykwsk",
"igqle", "eukgf", "qzglav", "ipysrdj", "gsgwqk", "kevlq",




"uqmgmst", "hiyswbt", "qmwmbsk", "skmuo", "tszockk", "kxizh", "thbwh",

"cnwzxpy", "helyfoo",

"myookpi", "gqikhhw",






"hrokzl", "rtgobsq", "kmfsmp", "chyhykz",













"faijmsh", "xzmdis", "arelp", "guvke", "rqilp", "eqpuuzs",










"zocwx", "mjtji",










"jenfafh", "cauig",




"bxwng", "ozvtqp",
"mprgtb", "qkicc",
"bjwny", "ghapm",




"lqcutyt", "uuvtlk",








"jibemf", "wtfliw",

"izvtqsa", "ssnhc",

"xqncgyu", "tsxfibs", "zofjia",








"tehat", "ttbuzrh", "jfieeor",


"qface", "yhvndwy",


"sygjhzp", "ilhib", "ldgyqh", "uewdyd", "skmbdhz",


"dzqqgbm", "qivxs",

"ffuqr", "rplcrt", "gmuwpyi", "zsukqjo",
"pxgkg", "zehkwy", "pwnxw", "uqfbnlo",

"jpvxzcn", "xvzinl", "pvyvx", "lxgvhy",
"iyfyi", "jhcwkl",

"hktzoq", "oigsk",


"bvmgrs", "bsfygp",

"mplhwo", "qvdid",
"olhfbr", "qgxgzo",
"eexmf", "emuwzd", "zzbad",
"qjuuu", "ohuvsf",


"azmneyd", "mmpnppi",


"hxmcaoy", "sybpg", "jfhqrla",
"vgegr", "lklqxg",

"xnxsdq", "ffgzg", "tvrxaw",


"jjhrmi", "jljjai", "afbzsz",
"iqbdxb", "fpgyyu",


"pxgcbfi", "lacddy", "hvisx",



"holen", "gjctf",


"gyoqtcg", "lovox", "srzfd",

"zyfwjxs", "evdwf",
"kklbcs", "ygkdmh", "cifdyio",
"nzhqepw", "satjdgz",
"qwxwd", "huvihu",

"ccpnopa", "lqlyf", "fxpoal",
"qyhvc", "kjoru", "myopc",
"adbxp", "jcise",


"hfmaqp", "ggfmiv",

"rkfspx", "uatlbrq", "cvnrr", "bwpeux",


"pwoyfeh", "zklbfdg",

"fqqyipa", "zihpcn", "wzqanwj", "wajnseu", "bnevesk", "wwxak",

"fyouz", "nsnqedk",
"zjzgs", "mpijr",




"qsvbb", "scxdo", "inlrm",
"uwjowb", "naekrk",
"lofayaa", "iltoh",

"kxyfb", "vmboh", "zguzlx",
"fixwkec", "gcowt",

"brjgwq", "kejtzg",


"bffnszc", "zxgrq", "ngxtfhu",
"hebhue", "edlved", "tafhilv", "iblvki",



"kpayh", "uzvsml",
"yhxlzc", "fkwbo", "ziyyc", "dlfmj",
"vxede", "pjazwiy", "ruozk", "sydjg",
"bjyraf", "bvypab",

"aewmad", "jefjzvl",


"evcveie", "ccter",
"gyfbgkr", "fghxbc", "qswoy", "gomcbqb", "tubhp", "zdqmuey", "gxddhu",
"eeziziu", "kaghlc",



"wtqxei", "mhxheb", "nuxxmd",

"sagyrje", "fxaglf",

"khdbe", "uuyfecv", "pnouux",
"vymmkdf", "qfcetm", "atbiby", "tcpduh", "ymeoz",




"fxlbc", "alhlvth", "yhfpq",
"rnqgy", "csyiik",

"oajdx", "yeaic",
"ydzibri", "syliku",
"hnedp", "iwicpur",

"lmlsog", "svanha", "sadnqcp",




"pryhgj", "tcjqw",


"jlofqwz", "bhfui",

"gdkjoit", "lmkwafp",







"fggyk", "mefmo",



"ifualyn", "kgqzrt", "mhjeza", "wfvjnxf",
"iiugq", "zgfqdv",


"oginzo", "twgjdmg",
"kglsx", "qsjqlp", "flkkr", "fbpbs",
"ixxww", "mxnlv", "waqca",
"tbaads", "xjadrfg",

"uftnfv", "vgemekb",




"mriqcjy", "khgvmj",






"nvfqmkw", "asozcan",
"ymataqq", "etfbuu", "wbqeo", "gcydgf",

"rdvciwk", "ulchkal",
"vwftcva", "perzy",
"uamqx", "gnughzp",

"bqywl", "cvcblhv", "ovpzt", "qlwhsix",





"kdeqm", "znwmvr", "iftyxdd",
"gxsxqwt", "yjrfr",




"jhwrcb", "pbkplz", "momda",



"uqjfarv", "myqre",

"crcrimv", "fxrijc",
"gibdxij", "whvvemg", "lfsvtih", "ckmftuc",
"kxwbdvm", "rhcxf", "nihiexp",
"yxemuyq", "mptovq",



"ukqmhyc", "teduvv", "lmhamlz",

"osjsm", "wptyd",
"jgrsa", "egtruqh", "kqiuy", "aduikk",





"kebhn", "bamxvq", "xaogy", "fefuzon",

"qahzrif", "rlfqf", "hekibe",
"iezyfwf", "jmypc", "rsizei", "jpyvpw",

"kczlit", "nggtuh", "umgch", "xkxqc",
"kabqu", "ujjoydl",
"aljgr", "lnwcryv",




"vrbcn", "kasaf", "hhqmsd", "idrror",
"ifwmfdm", "rylaxjf", "oylvq", "locto",
"zxygs", "rkwquj", "owxawf", "ahfdt",
"gmirjhi", "aucjw",

"djzjiwd", "lsire", "vlbivgc", "xdctkbj", "ygvpk",


"gisrnfs", "rpqbv",
"xkzvo", "xxego",





"zdnypzo", "sglkjsh",


"ceeotg", "ejxib",
"ofxzyhr", "dzxpqj",
"wuclmu", "citaywz", "ljjyy",

"bgehlas", "pocvrcs",
"miwst", "elgtk",


"ysafyj", "vlyof",


"sjaax", "szcmb", "klovr",







"vvkkkpb", "ulragq",




"gvamhux", "dtfdn",




"howlyws", "wuknah", "bjvuicy",


"ifbhg", "nqicerc",
"rfcbs", "hioofm", "jspui",




"bxmcg", "vmpnccn", "pjjmau",

"ujuunj", "iugsida",


"zafggcz", "rbuwrpw",
"ocppbp", "gwbfat",

"spwqxpy", "iedfk", "ugcccv", "djviima", "xgfad",
"hblux", "nemrt",


"ohsvn", "wkamonm",


"kpvbt", "nnmayb",


"slahk", "zytau",
"zcomxf", "bmqhvfv", "hwdtvvc", "laopkn",





"zmkwnv", "pcecbrn", "hregcx", "muptknj",
"vopqzha", "uytsdd", "uevxbyn",

"cuprzhk", "ozhydny",

"yybnbso", "tzhwvzt",


"wrlkfij", "xlkwyg",

"dgosy", "zvgsa",

"mtflvu", "oothjv",
"izdhn", "yzhvrx", "eionkb", "eadvs", "jkkqxfr",

"emwblax", "dfiyju", "qryui", "eydak",





"pubtxq", "lpsafeq",


"lbxdtms", "jensj", "zkpfzio", "jobwpao", "jxfimbl",
    };

    System.out.println(getRootProgram (allNames, linkedNames));

    String[][] programValues = {
      { "ifyzcgi","14" },
{ "axjvvur","50" },
{ "tcmdaji","40" },
{ "yjzqr","73" },
{ "smascq","97" },
{ "hyehtm","7" },
{ "oylvq","136" },
{ "csyiik","34" },
{ "zivjpfo","23" },
{ "ggfmiv","94" },
{ "vpltn","41" },
{ "gzxnn","171" },
{ "bsfygp","75" },
{ "dnrjb","9" },
{ "ohdnhx","261" },
{ "frcrd","56" },
{ "cldaag","31" },
{ "vphlxz","26" },
{ "nljmcv","47" },
{ "xcxqa","6759" },
{ "hywzja","81" },
{ "ytxcti","60" },
{ "igzvp","68" },
{ "uzvsml","34" },
{ "keusrg","27" },
{ "tlmfw","45" },
{ "hjmtrw","6772" },
{ "ahjlf","1474" },
{ "egszxz","14" },
{ "skmuo","1607" },
{ "ifyja","32" },
{ "dwnokzu","311" },
{ "txbgfm","33" },
{ "roqfxg","62" },
{ "autjn","29" },
{ "hnedp","10" },
{ "owxawf","60" },
{ "jensj","281" },
{ "sglkjsh","66" },
{ "eeziziu","34" },
{ "qjuuu","83" },
{ "iebulx","297" },
{ "lhfuku","159" },
{ "mxnlv","61" },
{ "emtjcx","60" },
{ "jspui","58" },
{ "nmikggy","64" },
{ "vatflrk","6" },
{ "jfcoc","41" },
{ "gyepcnc","6" },
{ "atbiby","80" },
{ "ygnkwn","52" },
{ "piexct","65" },
{ "uitfx","39" },
{ "rdvciwk","55" },
{ "jkgnvbn","23" },
{ "xpewzk","45" },
{ "vlqyxe","337" },
{ "bmdgthp","215" },
{ "czafdho","24" },
{ "emuwzd","102" },
{ "fwabsk","14" },
{ "uftnfv","53" },
{ "ndkcn","39" },
{ "srzfd","77" },
{ "gqhnstx","870" },
{ "bdnjn","57" },
{ "pbckxv","14" },
{ "fbpbs","74" },
{ "zwutlym","92" },
{ "lzeud","290" },
{ "gjctf","27" },
{ "azmneyd","60" },
{ "wbenaek","253" },
{ "orpjw","72" },
{ "dgyulo","9" },
{ "qklqozd","125" },
{ "waiwj","47" },
{ "bnevesk","256" },
{ "yqnjd","50" },
{ "vvkkkpb","39" },
{ "ciprksz","84" },
{ "hblux","91" },
{ "dfywz","60" },
{ "jeiqx","26" },
{ "zdissfg","7" },
{ "mriqcjy","66" },
{ "eydak","49" },
{ "qwxwd","49" },
{ "plhlj","64" },
{ "nqgbp","67" },
{ "ewwfzg","70" },
{ "djzjiwd","44600" },
{ "mtflvu","71" },
{ "shesfq","143" },
{ "huzokb","298" },
{ "ohuvsf","83" },
{ "wcdibhx","196" },
{ "fxlbc","184" },
{ "lnknp","91" },
{ "swugafb","504" },
{ "pmadd","97" },
{ "mprgtb","42" },
{ "lorxjw","62" },
{ "welidg","97" },
{ "zzbad","30" },
{ "dwejsn","40" },
{ "fvivo","225" },
{ "zuawuo","111" },
{ "ikaol","26" },
{ "mmhtyd","220" },
{ "hujjten","37" },
{ "htqps","36" },
{ "dlobfkw","44" },
{ "fxrijc","57" },
{ "xgfad","33" },
{ "pafiy","17" },
{ "cblhmk","1108" },
{ "kioga","93" },
{ "ljhlxc","83" },
{ "qsvbb","56" },
{ "uaffk","61" },
{ "lvptmrf","58" },
{ "hebhue","11" },
{ "eefyyr","10" },
{ "wyylpt","184" },
{ "vmboh","90" },
{ "ghcgz","195" },
{ "jjhrmi","190" },
{ "teduvv","25" },
{ "xjadrfg","28" },
{ "ugcccv","67" },
{ "psdzpg","38" },
{ "hyhbu","593" },
{ "satjdgz","60" },
{ "cjbdxts","34" },
{ "gdunxee","53" },
{ "fqswta","47" },
{ "iwouvid","81" },
{ "iqbdxb","67" },
{ "ozbjpiq","16" },
{ "ysafyj","97" },
{ "lcchgb","82" },
{ "wkamonm","19" },
{ "waqca","61" },
{ "bbeyl","9" },
{ "rkfspx","17" },
{ "nggtuh","64" },
{ "jmypc","20" },
{ "yfegso","122" },
{ "zirysk","72" },
{ "rtsbgwx","251" },
{ "yxgwsj","14" },
{ "xmgqmv","84" },
{ "lncmhi","48" },
{ "orclyi","30" },
{ "bjwny","94" },
{ "zehkwy","69" },
{ "mzajj","92" },
{ "ffsehyc","17" },
{ "agelbfq","343" },
{ "dgcecu","86" },
{ "wtqxei","61" },
{ "vlmihf","32" },
{ "lovox","77" },
{ "cmvofka","30" },
{ "ttbuzrh","96" },
{ "vsunxw","196" },
{ "skfnp","97" },
{ "upuybrd","300" },
{ "cpmebw","60" },
{ "wkmtw","59" },
{ "rpvwtq","5" },
{ "jenfafh","58" },
{ "pubtxq","51" },
{ "xlkwyg","55" },
{ "iltoh","22" },
{ "ctaazgn","103" },
{ "zxhqlfy","26" },
{ "dklujy","76" },
{ "khgvmj","66" },
{ "yfnkp","33" },
{ "edsjbi","37" },
{ "brtomr","75" },
{ "siqcu","15" },
{ "kxdehcg","13" },
{ "vmkeu","315" },
{ "momda","90" },
{ "pocvrcs","6" },
{ "sonvcww","17" },
{ "nemrt","91" },
{ "ldbkyg","75" },
{ "jsrrt","22" },
{ "ifuvyo","180" },
{ "kfzqw","80" },
{ "iyfyi","41" },
{ "tykwy","44" },
{ "twgjdmg","24" },
{ "qface","27" },
{ "ygkdmh","74" },
{ "sblfh","120" },
{ "gbldz","49" },
{ "hmjpa","122" },
{ "wsixz","14" },
{ "vgegr","83" },
{ "fggyk","46" },
{ "kjoru","16" },
{ "ixqrl","22" },
{ "gklehu","84" },
{ "xxego","33" },
{ "jxfimbl","95" },
{ "vymmkdf","116" },
{ "jpwtbds","1608" },
{ "xsztla","828" },
{ "wtfliw","87" },
{ "lbxrh","94" },
{ "ybioco","29" },
{ "yvdhwyh","102" },
{ "eauxeyl","53" },
{ "skuazsw","70" },
{ "jlcie","99" },
{ "ckmftuc","21" },
{ "yuikqm","68" },
{ "dqbfloz","87" },
{ "zofjia","133" },
{ "vyvrn","173" },
{ "tszockk","729" },
{ "ydqqgrw","15" },
{ "hcxwql","398" },
{ "gjedup","5" },
{ "arelp","195" },
{ "aonfn","235" },
{ "lsgbe","99" },
{ "gunvu","99" },
{ "kasaf","34" },
{ "imohij","13" },
{ "khwbzl","1131" },
{ "nwikfyc","80" },
{ "khtegw","91" },
{ "epggt","90" },
{ "yapaib","175" },
{ "saawhdk","12641" },
{ "qoetrb","15" },
{ "ztmmr","147" },
{ "uqfbnlo","69" },
{ "sgrhs","249" },
{ "hqjinj","101" },
{ "vmpnccn","73" },
{ "vqddcl","71" },
{ "yffeit","76" },
{ "xvzinl","99" },
{ "znzbkh","16" },
{ "gnjit","23" },
{ "qojhhod","1789" },
{ "aluqao","313" },
{ "ipysrdj","222" },
{ "worqh","73" },
{ "tsxfibs","46" },
{ "pcumn","420" },
{ "mejwrm","139" },
{ "aynpyne","44" },
{ "sikmtaj","58" },
{ "sbfprua","70" },
{ "wwofru","53" },
{ "nmuxe","88" },
{ "uuvtlk","74" },
{ "rqisvrh","2703" },
{ "ehjjbu","89" },
{ "cbmqx","163" },
{ "naekrk","70" },
{ "cvnrr","17" },
{ "pwnqyt","133" },
{ "sagyrje","49" },
{ "efuysje","97" },
{ "pzwtjfj","74" },
{ "ggmhxx","42" },
{ "bhfui","13" },
{ "chlpx","87" },
{ "hmlbrz","55" },
{ "oneoorw","90" },
{ "kyfuyaf","79" },
{ "kiylza","88" },
{ "fghxbc","99" },
{ "qgxgzo","14" },
{ "cubqfzc","184" },
{ "lcqfe","61" },
{ "xypffi","11" },
{ "qntzr","92" },
{ "mkjuq","181" },
{ "dhtii","62" },
{ "amtqhf","99" },
{ "ixknk","37" },
{ "iuapj","162" },
{ "khtooum","53" },
{ "aecsfp","72" },
{ "fcdcdh","88" },
{ "junfev","18" },
{ "pxfrz","91" },
{ "xratfed","6" },
{ "gwbfat","26" },
{ "cvcblhv","73" },
{ "sdfvrod","114" },
{ "xkfkucf","951" },
{ "okkvefs","820" },
{ "dgosy","59" },
{ "yhvndwy","27" },
{ "pefzsea","86" },
{ "xaogy","131" },
{ "nvpdisw","93" },
{ "lmkwafp","56" },
{ "cwnvk","51" },
{ "phbtrm","171" },
{ "mrmbyj","53" },
{ "jibemf","87" },
{ "tysdkgl","20" },
{ "fpuscxk","147" },
{ "ejkumeu","235" },
{ "uijgiu","38" },
{ "cjjynt","264" },
{ "nobfn","236" },
{ "svanha","62" },
{ "nuxxmd","53" },
{ "vsaejz","45" },
{ "hbbpuc","238" },
{ "tbley","31" },
{ "bkkwe","70" },
{ "tywzxwb","24" },
{ "ezqeusd","71" },
{ "qwcyozf","115" },
{ "xpwxo","80" },
{ "layqazp","39" },
{ "hwdtvvc","40" },
{ "pwnxw","69" },
{ "jobwpao","181" },
{ "wrhnq","87" },
{ "amsfvm","53" },
{ "dfxjjzr","190" },
{ "cnwzxpy","65" },
{ "kpvbt","85" },
{ "ifbhg","62" },
{ "cpeonw","27" },
{ "rsizei","20" },
{ "gmkvgf","63" },
{ "bjiuus","56" },
{ "bwpeux","17" },
{ "szrkuzi","27" },
{ "ygvpk","33701" },
{ "mjtji","35" },
{ "rqvvv","50" },
{ "pozua","128" },
{ "hmjueiq","79" },
{ "hdxrbzc","45" },
{ "twway","181" },
{ "jocmdmv","72" },
{ "lacddy","68" },
{ "lsxjl","94" },
{ "edotax","14" },
{ "gmirjhi","62" },
{ "iwicpur","10" },
{ "uigcn","61" },
{ "ynhvfvx","32" },
{ "ugavy","91" },
{ "jbgxcj","48" },
{ "zdglrh","239" },
{ "lmlsog","62" },
{ "sazbmjz","65" },
{ "ymeoz","24" },
{ "hhqmsd","34" },
{ "ykmfoah","245" },
{ "lfdefc","30" },
{ "qynrx","53" },
{ "znely","919" },
{ "cauig","58" },
{ "gvamhux","71" },
{ "hqqingt","13" },
{ "fiynt","72" },
{ "tyysd","63" },
{ "igkrktn","37" },
{ "pzbxpou","87" },
{ "dllzp","59" },
{ "iblvki","11" },
{ "vaovit","44" },
{ "tcpduh","212" },
{ "btpvxq","56" },
{ "xxnpoe","67" },
{ "sboms","24" },
{ "whvvemg","83" },
{ "ljjyy","64" },
{ "qvdid","70" },
{ "koxnez","71" },
{ "elgtk","40" },
{ "wesoooi","87" },
{ "tiikt","92" },
{ "eadvs","797" },
{ "sreke","34" },
{ "clqqyi","51" },
{ "kuufl","1074" },
{ "qswoy","7" },
{ "rakfg","91" },
{ "zvgsa","59" },
{ "gskveo","15" },
{ "clbbi","27" },
{ "ilcsp","844" },
{ "blnwcb","17" },
{ "udaitd","23" },
{ "aewmad","73" },
{ "tvdsktm","64" },
{ "zavcu","25" },
{ "gglxj","47" },
{ "jmrlaxf","48" },
{ "sppxnti","48" },
{ "zhdioii","243" },
{ "olepfo","98" },
{ "ezsnmw","14" },
{ "hsmjm","25" },
{ "xmuxsr","44" },
{ "kmvcmg","17" },
{ "zuoeh","7782" },
{ "sqxrad","80" },
{ "vrbcn","34" },
{ "ibevwow","308" },
{ "rqilp","25" },
{ "ojfzokk","99" },
{ "bjwvw","209" },
{ "sygjhzp","36" },
{ "pjvnmqn","43" },
{ "qqjly","56" },
{ "iezyfwf","20" },
{ "wrlkfij","55" },
{ "wuvhyc","40" },
{ "aqgtml","51" },
{ "fhjysp","164" },
{ "rmlru","71" },
{ "bdiiv","15" },
{ "tlxekcp","42" },
{ "lbozpy","80" },
{ "uksnrfx","224" },
{ "gmuwpyi","90" },
{ "zsqzm","64" },
{ "evhhfo","5" },
{ "xdyrvy","189" },
{ "gbxxpd","82" },
{ "nzhqepw","60" },
{ "zfteizz","59" },
{ "ulragq","39" },
{ "jgrsa","269" },
{ "uisnk","2228" },
{ "chyhykz","59" },
{ "zjveu","437" },
{ "syliku","78" },
{ "syzcti","32" },
{ "nnmayb","85" },
{ "zdqmuey","209" },
{ "myopc","16" },
{ "cifdyio","74" },
{ "nguafeb","42" },
{ "dbczwnr","15" },
{ "vxede","10" },
{ "ouhuptm","52" },
{ "sdyox","93" },
{ "slahk","43" },
{ "skbrota","217" },
{ "hbaxtai","851" },
{ "hvdfq","112" },
{ "zgfqdv","15" },
{ "dpqxfp","209" },
{ "arskvgv","88" },
{ "bqywl","157" },
{ "ymataqq","22" },
{ "krwgy","109" },
{ "ohsyhln","53" },
{ "ofqbu","24" },
{ "ccpnopa","59" },
{ "bfkbp","156" },
{ "bolpsk","86" },
{ "tckyc","456" },
{ "qbftkij","204" },
{ "bpcnzi","82" },
{ "rhacrz","27" },
{ "wzbqh","306" },
{ "qqnmzb","1723" },
{ "tuvehcz","17" },
{ "yzufk","30" },
{ "xsmyok","48" },
{ "tgiou","19" },
{ "izvtqsa","84" },
{ "ooufod","51" },
{ "rfwaq","80" },
{ "lpoejf","30" },
{ "oykwsk","76" },
{ "wdipy","92" },
{ "jbnns","93" },
{ "qcxiehu","312" },
{ "vsslzfp","91" },
{ "uimoc","30" },
{ "phtghp","3945" },
{ "svthizp","1149" },
{ "xvwvc","23" },
{ "ovpzt","139" },
{ "uatlbrq","17" },
{ "hmpisyb","41" },
{ "pehflc","56" },
{ "iedfk","49" },
{ "nomeb","112" },
{ "ffuqr","90" },
{ "gsgwqk","204" },
{ "igqle","222" },
{ "jhcwkl","41" },
{ "yfusbw","76" },
{ "lpsafeq","51" },
{ "lklqxg","83" },
{ "lofayaa","22" },
{ "itqwz","113" },
{ "xbidr","74" },
{ "pnouux","9" },
{ "ryazls","221" },
{ "bxwng","53" },
{ "xwkyrer","8691" },
{ "nbmnwsq","52" },
{ "cxfsoh","53" },
{ "gdylf","74" },
{ "vksyy","96" },
{ "qekxzsx","87" },
{ "qzglav","42" },
{ "xsoqzbe","1068" },
{ "lndczw","19" },
{ "perzy","46" },
{ "oigsk","38" },
{ "uytsra","106" },
{ "zszzkl","72" },
{ "wfvjnxf","93" },
{ "pklcmix","6" },
{ "cvpuwrb","82" },
{ "ileugiu","225" },
{ "defbun","57" },
{ "fbzvm","72" },
{ "aduikk","133" },
{ "shlfz","3932" },
{ "yhjhgu","57" },
{ "vgiqvsi","53" },
{ "iajts","451" },
{ "kxwbdvm","1104" },
{ "rynmge","25" },
{ "bqxnoid","31" },
{ "kqqsq","37" },
{ "xrunic","14" },
{ "vqnyvr","57" },
{ "lvdrrk","48" },
{ "bamxvq","86" },
{ "xkzvo","33" },
{ "vhoasjq","226" },
{ "hkgxpgh","46" },
{ "zocwx","35" },
{ "qhyfphs","6" },
{ "coselm","44" },
{ "ypbrxyq","206" },
{ "ffgzg","151" },
{ "ujuunj","64" },
{ "iuchai","53" },
{ "ykvss","37" },
{ "ovszp","64" },
{ "helyfoo","65" },
{ "pryhgj","81" },
{ "fxhqq","29" },
{ "eeshl","30" },
{ "qzftgbx","44" },
{ "ppcsoo","26" },
{ "xinfpy","53" },
{ "ddraicf","9" },
{ "xidtz","126" },
{ "ipsst","23" },
{ "wzvzgg","60" },
{ "fqqyipa","200" },
{ "jpyvpw","20" },
{ "xhzyzer","82" },
{ "boszym","129" },
{ "kabqu","38" },
{ "sdpsl","99" },
{ "bekguie","31" },
{ "klovr","30" },
{ "zklbfdg","47" },
{ "ccter","84" },
{ "wzqanwj","240" },
{ "uxbrs","94" },
{ "dzxpqj","22" },
{ "csrww","15" },
{ "wwxak","108" },
{ "etfbuu","22" },
{ "miwst","40" },
{ "iiugq","15" },
{ "cuprzhk","40" },
{ "waakcx","238" },
{ "faijmsh","35" },
{ "cvlod","76" },
{ "sjgvkg","1566" },
{ "ixxww","61" },
{ "mipqe","91" },
{ "xitcp","88" },
{ "lxudoaz","51" },
{ "ibkfqok","19" },
{ "ulchkal","55" },
{ "qubli","60" },
{ "tsamaj","1171" },
{ "mmpnppi","60" },
{ "prlvn","63" },
{ "ddwursx","245" },
{ "aljgr","62" },
{ "glkjrrs","93" },
{ "vwftcva","46" },
{ "ylbaxtu","144" },
{ "jqpdpr","14" },
{ "yzhvrx","90" },
{ "iqoxkhd","91" },
{ "locrtxl","2681" },
{ "fbmajm","58" },
{ "rylaxjf","90" },
{ "wyois","46" },
{ "ecwjaw","91" },
{ "alhlvth","36" },
{ "jlofqwz","13" },
{ "sdktm","23" },
{ "bjvuicy","217" },
{ "hepkop","7311" },
{ "gqbwc","25" },
{ "yojcz","201" },
{ "obwkzhc","86" },
{ "cdqdm","2502" },
{ "gjcibb","23" },
{ "igdtz","83" },
{ "phsmt","112" },
{ "hdjzg","77" },
{ "jukxlr","29" },
{ "oajdx","61" },
{ "ktayld","179" },
{ "dkxzsaq","83" },
{ "utewfcr","50" },
{ "jljjai","14" },
{ "gnughzp","5" },
{ "oyienb","16" },
{ "kqicqf","15" },
{ "ggvwlp","80" },
{ "vlbivgc","13370" },
{ "kczlit","64" },
{ "mblvpm","124" },
{ "wehdeq","6" },
{ "fegaac","206" },
{ "qpsirr","15" },
{ "gisiv","80" },
{ "xjkquk","87" },
{ "rsdub","61" },
{ "gzxddd","46" },
{ "oxsewk","51" },
{ "ahfdt","234" },
{ "wafjqj","80" },
{ "mhjeza","93" },
{ "bljkg","12" },
{ "fkapr","39" },
{ "dtfdn","71" },
{ "zxgrq","25" },
{ "rlfqf","63" },
{ "hvisx","68" },
{ "laopkn","40" },
{ "zvszwl","50" },
{ "gorpw","55" },
{ "skmbdhz","54" },
{ "ecaiau","424" },
{ "bfwnv","6" },
{ "uhvtpfy","47" },
{ "zafggcz","17" },
{ "qkrpzl","170" },
{ "bvmgrs","75" },
{ "iicpkf","16" },
{ "rbuwrpw","17" },
{ "funnv","5679" },
{ "flkkr","74" },
{ "brzucfh","39" },
{ "lfavcfd","72" },
{ "dmvcduz","38" },
{ "izdhn","1183" },
{ "hrnrjrt","9135" },
{ "eiatt","291" },
{ "czvyrzi","52" },
{ "ypkhqlq","39" },
{ "egxzjn","81" },
{ "qzzlmw","319" },
{ "xepgx","64" },
{ "iftyxdd","79" },
{ "rskara","87" },
{ "uytsdd","292" },
{ "mqodhde","36" },
{ "ylqvuk","48" },
{ "gisrnfs","23" },
{ "vntsex","77" },
{ "rwmdbn","2136" },
{ "fhhgts","38" },
{ "opdtk","72" },
{ "beewze","66" },
{ "leyikdx","1995" },
{ "kcbwrrr","631" },
{ "jwhcmc","72" },
{ "mqcflzv","76" },
{ "ofwbsgp","58" },
{ "hiyswbt","889" },
{ "armfpvt","98" },
{ "zsknxq","51" },
{ "pewxc","246" },
{ "lhmgw","19" },
{ "qwmqci","38" },
{ "hioofm","319" },
{ "cujimpt","137" },
{ "htstksc","169" },
{ "quwfos","85" },
{ "tcjqw","81" },
{ "orbcuzi","89" },
{ "sybpg","49" },
{ "qyhvc","16" },
{ "sadnqcp","62" },
{ "zihpcn","232" },
{ "zxygs","208" },
{ "gyoqtcg","77" },
{ "emwblax","49" },
{ "hewatw","99" },
{ "qxkvfid","53" },
{ "kglsx","74" },
{ "yhfpq","56" },
{ "zivlnu","23" },
{ "xsyzhcf","89" },
{ "howlyws","206" },
{ "uycop","59" },
{ "yhxlzc","91" },
{ "isqvoex","30" },
{ "bklfmch","80" },
{ "tvrxaw","106" },
{ "lkreb","72" },
{ "kxyfb","90" },
{ "jnrnwos","61" },
{ "mxbrva","72" },
{ "qkhqrq","30" },
{ "gfhummb","40" },
{ "zwzzce","221" },
{ "rrvbwb","34" },
{ "enlctw","6" },
{ "yeaic","61" },
{ "otipr","480" },
{ "qxkhq","143" },
{ "wbqeo","22" },
{ "iugsida","64" },
{ "azuoza","44" },
{ "yxemuyq","19" },
{ "fyouz","18" },
{ "bnlbs","38" },
{ "hilafgl","59" },
{ "shdgsk","88" },
{ "rnqgy","34" },
{ "kmwxj","92" },
{ "hmmjjct","9" },
{ "mefmo","46" },
{ "lwvfsu","53" },
{ "fixwkec","84" },
{ "haclvfu","61" },
{ "werkz","29" },
{ "iovxjv","1204" },
{ "dmglcj","17" },
{ "qprenhy","221" },
{ "qmwmbsk","804" },
{ "zywvdda","52" },
{ "ntkpthi","6" },
{ "jkkqxfr","1135" },
{ "muptknj","66" },
{ "uwnwp","92" },
{ "ggwtf","213" },
{ "afywb","87" },
{ "xglsp","94" },
{ "elovaun","38" },
{ "qhubjd","59" },
{ "exwzzr","1542" },
{ "xhhwwso","43" },
{ "uevxbyn","170" },
{ "pqgiox","50" },
{ "edjlm","33" },
{ "ypdumo","48" },
{ "ehhbjt","26" },
{ "cxyfam","98" },
{ "bhqlq","82" },
{ "abamn","8" },
{ "sjdanf","49" },
{ "wcjnjpf","57" },
{ "xzvln","9" },
{ "citaywz","64" },
{ "aqtog","66" },
{ "khdbe","9" },
{ "vksnq","85" },
{ "fkwbo","91" },
{ "jefjzvl","73" },
{ "azoutv","72" },
{ "aqvtgi","90" },
{ "vlyof","97" },
{ "gwyljq","43" },
{ "xmedt","39" },
{ "rsstvn","75" },
{ "vekxdqh","85" },
{ "toeyz","23" },
{ "pvyvx","99" },
{ "pwmrau","9594" },
{ "qahzrif","63" },
{ "gzjut","14" },
{ "mzyqoc","194" },
{ "tkdvenx","44" },
{ "vtefqb","68" },
{ "yekmflj","64" },
{ "pdbykx","14" },
{ "fpgyyu","67" },
{ "qjbbyb","26" },
{ "izzzyqd","186" },
{ "lsire","61685" },
{ "vbuvkx","204" },
{ "ahqfu","5" },
{ "cjxyp","81" },
{ "aeatvub","10983" },
{ "jhnujj","14" },
{ "cxpwfir","63" },
{ "gcydgf","22" },
{ "zlbnkdc","92" },
{ "lrjbgd","41" },
{ "casmwo","246" },
{ "rqqlzs","270" },
{ "xtqthxs","44" },
{ "kjonvut","27" },
{ "mptovq","19" },
{ "dwrwuoq","93" },
{ "ziiqv","81" },
{ "vnfigul","38" },
{ "jpynea","88" },
{ "rplcrt","90" },
{ "flptbw","159" },
{ "nojly","42" },
{ "jbqmy","86" },
{ "ozhydny","40" },
{ "zzflc","92" },
{ "jktlfu","47" },
{ "njvkdrp","13" },
{ "qyurm","76" },
{ "bjyraf","7" },
{ "zhpfgzv","47" },
{ "qfcetm","30" },
{ "dhfagjw","67" },
{ "qriyeb","89" },
{ "ucaee","68" },
{ "djvkd","36" },
{ "scqtkga","54" },
{ "yvgkdi","992" },
{ "zsukqjo","90" },
{ "hfmaqp","94" },
{ "gxsxqwt","20" },
{ "marord","48" },
{ "uloppmh","50" },
{ "iktmpdq","34" },
{ "wnvrg","39" },
{ "cxiturs","95" },
{ "fewrzd","24" },
{ "swnan","85" },
{ "xdojlm","54" },
{ "dhtxpbb","86" },
{ "roogi","100" },
{ "yffhk","143" },
{ "ffinat","630" },
{ "txrfl","81" },
{ "eoustfr","80" },
{ "bxmcg","249" },
{ "kdeqm","99" },
{ "lfsvtih","97" },
{ "qkhvu","72" },
{ "zzfcq","7259" },
{ "kebhn","106" },
{ "ljmrml","178" },
{ "asozcan","96" },
{ "ceeotg","53" },
{ "fonrd","12" },
{ "fvmeeas","88" },
{ "cejtpyf","71" },
{ "wsvfkr","193" },
{ "evdwf","31" },
{ "wqgssb","37" },
{ "uhnqr","247" },
{ "xzmdis","24" },
{ "tafhilv","11" },
{ "mhpzrw","96" },
{ "cgrima","79" },
{ "nrwmjk","53" },
{ "yjutt","47" },
{ "cxcyrd","62" },
{ "fwwub","146" },
{ "sapwhr","17" },
{ "ihzsljz","46" },
{ "zmkwnv","66" },
{ "yytpewc","50" },
{ "xdctkbj","83" },
{ "kptjhtd","86" },
{ "pcecbrn","66" },
{ "sdwrx","31" },
{ "dfiyju","49" },
{ "gxddhu","133" },
{ "zvpboy","76" },
{ "fndyvvn","85" },
{ "ozvtqp","53" },
{ "kxizh","74" },
{ "zwzxy","38" },
{ "rkjuz","71" },
{ "jagdwg","46" },
{ "rutqzk","14" },
{ "zymggc","39" },
{ "afbzsz","148" },
{ "ymdmn","99" },
{ "twoyl","58" },
{ "lqcutyt","74" },
{ "nlacdac","38" },
{ "otikjx","40" },
{ "rxzfdg","87" },
{ "huvihu","49" },
{ "cfbaj","90" },
{ "lqlyf","59" },
{ "apxgf","38" },
{ "nqicerc","62" },
{ "iksaub","99" },
{ "avyoy","252" },
{ "kzzfvt","94" },
{ "uqeag","162" },
{ "crhojk","40" },
{ "oxoocfp","237" },
{ "aylxc","31" },
{ "khnjt","92" },
{ "ytvjxq","260" },
{ "xkxqc","64" },
{ "ogmoqb","8" },
{ "nvfca","42" },
{ "xaycmtu","67" },
{ "kklbcs","74" },
{ "wqtuhe","341" },
{ "unqui","79" },
{ "vhkydm","99" },
{ "zcomxf","40" },
{ "hsxhyf","63" },
{ "rwakmo","80" },
{ "uogva","17" },
{ "cesnj","57" },
{ "rtcfcyn","32" },
{ "qckzqv","77" },
{ "oixlcn","37" },
{ "iaoyb","72" },
{ "idrror","34" },
{ "bcldmsg","67" },
{ "lbxdtms","281" },
{ "adbxp","35" },
{ "qsjqlp","74" },
{ "mjumixz","98" },
{ "rtmiw","97" },
{ "jzmacb","29" },
{ "umgch","64" },
{ "rpjozji","279" },
{ "xvayjwv","44" },
{ "vgemekb","53" },
{ "odpqjr","263" },
{ "hekibe","63" },
{ "xmaqelf","36" },
{ "ivlus","47" },
{ "rkwhbhr","50" },
{ "pawvr","12" },
{ "crcrimv","57" },
{ "ukfsn","86" },
{ "nfcbi","117" },
{ "qwfvm","75" },
{ "jfieeor","96" },
{ "eolqn","91" },
{ "bgehlas","6" },
{ "ruozk","10" },
{ "gqikhhw","54" },
{ "pqjua","14" },
{ "jtyurkp","239" },
{ "wjbdxln","99" },
{ "paopwt","77" },
{ "fefuzon","126" },
{ "ifualyn","93" },
{ "npccgnv","50" },
{ "nvcafwu","11" },
{ "htecpc","99" },
{ "uxbhu","175" },
{ "gzfrn","365" },
{ "qlwhsix","71" },
{ "uvkxner","46" },
{ "kmfel","77" },
{ "ytiljvt","97" },
{ "cxqeyt","30" },
{ "yyursb","93" },
{ "mpijr","88" },
{ "rpqbv","23" },
{ "oginzo","24" },
{ "sydjg","10" },
{ "ehlnex","34" },
{ "ukqmhyc","25" },
{ "gshsx","6" },
{ "nafrmeo","76" },
{ "ifwmfdm","114" },
{ "rmexd","59" },
{ "ujbzq","41" },
{ "scxdo","56" },
{ "bvmgt","1203" },
{ "vkaay","13" },
{ "pxdkes","42" },
{ "witry","76" },
{ "ttpmzgm","83" },
{ "pxgkg","69" },
{ "vwojto","41" },
{ "jcise","35" },
{ "tbioyr","85" },
{ "wnpnfiv","55" },
{ "ejxib","53" },
{ "htpblzv","83" },
{ "dgdtt","155" },
{ "weyfsg","53" },
{ "aodoc","91" },
{ "vmeubf","759" },
{ "pwetqid","13" },
{ "pudso","45" },
{ "ibjdru","136" },
{ "rtgobsq","59" },
{ "kqiuy","81" },
{ "gfszte","23" },
{ "ngxtfhu","25" },
{ "fphmu","62" },
{ "yxzlpnj","85" },
{ "khixdho","46" },
{ "pjjmau","353" },
{ "ttofoep","88" },
{ "fhycptc","98" },
{ "nsghrq","105" },
{ "hmdxion","30" },
{ "nsbzfgy","167" },
{ "hngao","361" },
{ "iitbuxz","1186" },
{ "ywnsmem","246" },
{ "qjsvs","66" },
{ "uuyfecv","9" },
{ "uafhv","223" },
{ "aocfuj","91" },
{ "kaghlc","34" },
{ "eionkb","1079" },
{ "hzhcl","127" },
{ "ssnhc","84" },
{ "ttfyrk","2158" },
{ "nvfqmkw","96" },
{ "qrrvi","18" },
{ "ajcbzv","55" },
{ "ydiicdl","93" },
{ "eyxccr","44" },
{ "gdkjoit","56" },
{ "urktg","196" },
{ "wuclmu","64" },
{ "rosfnb","26" },
{ "osjsm","87" },
{ "kgoyufq","133" },
{ "kihqh","80" },
{ "xjyyfe","25" },
{ "gyfbgkr","16" },
{ "bidhw","89" },
{ "wfpzhfz","78" },
{ "rnyndr","149" },
{ "xqncgyu","25" },
{ "hvmlb","141" },
{ "txwzysl","96" },
{ "suuhqpd","48" },
{ "djviima","31" },
{ "ddguar","116" },
{ "wptyd","87" },
{ "obbpd","24" },
{ "anoxh","63" },
{ "llgbz","167" },
{ "mhxheb","167" },
{ "yybnbso","89" },
{ "lxgvhy","99" },
{ "yffpvf","1698" },
{ "ttvfha","156" },
{ "tocvooe","99" },
{ "taxrkif","52" },
{ "rvixnmq","376" },
{ "uhwnr","60" },
{ "djvfa","18" },
{ "rjmuly","53" },
{ "pnhpv","227" },
{ "sjaax","190" },
{ "amtayi","29" },
{ "vbmyyrh","142" },
{ "gomcbqb","203" },
{ "oijwjli","37" },
{ "wajnseu","20" },
{ "hghjsk","348" },
{ "dzqqgbm","10" },
{ "guvke","19" },
{ "jpvxzcn","99" },
{ "mplhwo","70" },
{ "dblmcye","325" },
{ "ahbcl","178" },
{ "liznr","50" },
{ "pwoyfeh","47" },
{ "jdiczst","37" },
{ "ejvipa","38" },
{ "oherzyz","53" },
{ "kivyltn","303" },
{ "szcmb","176" },
{ "ofxzyhr","22" },
{ "xmzzrgs","266" },
{ "gdrxgji","12" },
{ "ziyyc","91" },
{ "wgqpt","29" },
{ "yykkph","63" },
{ "yoxetv","1724" },
{ "xqpfvwx","59" },
{ "fxaglf","49" },
{ "shjxje","56" },
{ "cdlzi","1615" },
{ "zytau","43" },
{ "ghakp","232" },
{ "lbhlxqa","76" },
{ "bchixdc","431" },
{ "olhnx","1796" },
{ "bvypab","7" },
{ "hregcx","66" },
{ "aucjw","62" },
{ "bmqhvfv","40" },
{ "fpfpv","1564" },
{ "lzypz","220" },
{ "ujjoydl","38" },
{ "rfcbs","197" },
{ "cmdizw","31" },
{ "iiqzvha","1325" },
{ "zdqsmv","91" },
{ "neywe","59" },
{ "teyakvf","89" },
{ "inlrm","56" },
{ "kpayh","34" },
{ "spwqxpy","79" },
{ "ofnewz","83" },
{ "knqxdq","63" },
{ "jtfylv","31" },
{ "jhyjqxq","363" },
{ "kmfsmp","59" },
{ "kskts","115" },
{ "hktzoq","38" },
{ "tajfmq","30" },
{ "zdxscz","72" },
{ "pywmbis","81" },
{ "yhsmjfq","29" },
{ "kzkfcn","10" },
{ "mieqti","16" },
{ "mxwbp","235" },
{ "thrvlt","81" },
{ "wqoae","12" },
{ "yivjj","62" },
{ "aumrixf","40" },
{ "gfigt","211" },
{ "cepxc","38" },
{ "vzxktth","76" },
{ "locto","240" },
{ "vopqzha","10" },
{ "lxwvf","72" },
{ "zuwaw","84" },
{ "oothjv","71" },
{ "tubhp","141" },
{ "wywxu","92" },
{ "uwjowb","70" },
{ "pwzsq","64" },
{ "eexmf","130" },
{ "ldgyqh","30" },
{ "ewswf","307" },
{ "tbaads","28" },
{ "rxsihsa","91" },
{ "dtmbf","50" },
{ "tzhwvzt","89" },
{ "qivxs","10" },
{ "nfucnzx","68" },
{ "znwmvr","63" },
{ "kejtzg","88" },
{ "eukgf","112" },
{ "skpux","146" },
{ "uewdyd","152" },
{ "dnynny","14" },
{ "guyrnpn","413" },
{ "lnmhw","83" },
{ "llkaoeh","68" },
{ "ydzibri","78" },
{ "gaashgh","307" },
{ "vbmqj","91" },
{ "uqmgmst","1336" },
{ "tijwlva","187" },
{ "fozagvz","37" },
{ "tafss","38" },
{ "dckbvlg","12" },
{ "oncexf","26" },
{ "jkkwtd","142" },
{ "evqibrc","66" },
{ "mrwbv","68" },
{ "hrokzl","59" },
{ "soirl","206" },
{ "ubuge","186" },
{ "rtutzu","73" },
{ "pmefov","983" },
{ "tnqram","7095" },
{ "dzfclsm","186" },
{ "pjazwiy","10" },
{ "mnqii","16" },
{ "uqjfarv","8" },
{ "xnxsdq","76" },
{ "lnwcryv","62" },
{ "lovaf","94" },
{ "rhcxf","84" },
{ "evcveie","84" },
{ "lyhlx","52" },
{ "zjzgs","88" },
{ "brjgwq","88" },
{ "wnfqsa","138" },
{ "balknnd","377" },
{ "ayqbj","64" },
{ "zynpp","67" },
{ "szglq","194" },
{ "ocppbp","26" },
{ "wuknah","36" },
{ "ifnkl","324" },
{ "eqkot","33" },
{ "yjrfr","20" },
{ "cvdows","11" },
{ "lybaepp","91" },
{ "jxaorvd","343" },
{ "zkpfzio","145" },
{ "evbtz","297" },
{ "srnnjbb","51" },
{ "viqvtzw","117" },
{ "nsnqedk","18" },
{ "wiapj","55" },
{ "jhwrcb","90" },
{ "zdnypzo","66" },
{ "eqpuuzs","149" },
{ "kevlq","156" },
{ "fxpoal","59" },
{ "dlfmj","91" },
{ "pbkplz","90" },
{ "qdqtw","15" },
{ "qkicc","42" },
{ "axgndac","156" },
{ "gptyqwd","91" },
{ "cwkdlil","46" },
{ "tmoui","91" },
{ "xxmtvr","154" },
{ "zijzutq","90" },
{ "xtaoisd","63" },
{ "szcozjr","215" },
{ "jfhqrla","155" },
{ "nsbnixe","77" },
{ "haqaohl","15" },
{ "eeune","31" },
{ "vgexqw","71" },
{ "ghapm","94" },
{ "swcvn","1105" },
{ "lmhamlz","25" },
{ "louebj","29" },
{ "fjcobs","6" },
{ "holen","27" },
{ "qryui","49" },
{ "olhfbr","14" },
{ "wcmyn","61" },
{ "dkmkdfd","173" },
{ "odqns","87" },
{ "xwjmsjr","97" },
{ "rqrhrnz","66" },
{ "uamqx","5" },
{ "rkwquj","92" },
{ "ncmad","23" },
{ "lefxyzt","56" },
{ "qcmnpm","335" },
{ "kgqzrt","93" },
{ "ttoer","916" },
{ "rahgf","25" },
{ "mdqeh","17" },
{ "ghdbwu","863" },
{ "thbwh","832" },
{ "gfjsie","90" },
{ "mmfuve","51" },
{ "vzcklke","80" },
{ "bffnszc","25" },
{ "saddwx","1569" },
{ "bmnsmqz","14" },
{ "qkawtfu","111" },
{ "edlved","11" },
{ "pxgcbfi","68" },
{ "gekygl","247" },
{ "egtruqh","389" },
{ "rvpxob","47" },
{ "ympbbx","1243" },
{ "pxkypf","54" },
{ "qqllir","25" },
{ "tehat","96" },
{ "gibdxij","121" },
{ "itlwpm","57" },
{ "rfknc","9" },
{ "ekvdv","44" },
{ "gwqgewp","99" },
{ "cvnabd","14" },
{ "dskuj","165" },
{ "yqgesx","175" },
{ "vljjqbw","55" },
{ "qmati","48" },
{ "afyxhh","87" },
{ "ubxvdq","90" },
{ "ckegba","32" },
{ "sysdxvb","66" },
{ "nihiexp","930" },
{ "myqre","8" },
{ "nwupf","109" },
{ "tzrqqk","79" },
{ "pwvahdb","85" },
{ "gcowt","84" },
{ "ohsvn","19" },
{ "zhohes","46" },
{ "ripilxo","299" },
{ "vwvowk","1293" },
{ "bmlkhaf","53" },
{ "kztkif","55" },
{ "ycpcv","72" },
{ "zyfwjxs","31" },
{ "esphpt","85" },
{ "jsmde","40" },
{ "zguzlx","90" },
{ "pcckqq","17" },
{ "hxmcaoy","235" },
{ "taacpu","57" },
{ "ilhib","60" },
{ "myookpi","54" },
{ "olrgu","97" },
{ "swnafht","44" }
    };
    HashMap<String, Integer> progamValueMap = getProgramValueMap(programValues);
    System.out.println(progamValueMap.get("hxmcaoy"));

    String[][] linkedPrograms = {


{ "tcmdaji", "wjbdxln", "amtqhf" },



{ "oylvq", "witry", "cvlod" },

{ "zivjpfo", "lcchgb", "bhqlq" },


{ "gzxnn", "mqodhde", "djvkd" },


{ "ohdnhx", "tgiou", "lndczw" },

{ "cldaag", "orbcuzi", "teyakvf" },


{ "xcxqa", "znely", "rtsbgwx", "hilafgl" },





{ "tlmfw", "pehflc", "lefxyzt" },
{ "hjmtrw", "cblhmk", "zzflc", "xsztla", "iitbuxz", "tckyc" },
{ "ahjlf", "ejvipa", "xhzyzer", "pzwtjfj" },

{ "skmuo", "rxsihsa", "vsslzfp" },
{ "ifyja", "rvixnmq", "aumrixf", "wbenaek", "jkkwtd", "ywnsmem", "mmhtyd", "xmzzrgs" },
{ "dwnokzu", "xinfpy", "lwvfsu" },

{ "roqfxg", "wrhnq", "rskara" },


{ "owxawf", "twoyl", "sikmtaj", "lvptmrf" },




{ "iebulx", "mqcflzv", "nafrmeo" },
{ "lhfuku", "syzcti", "ynhvfvx", "ckegba" },


{ "jspui", "chlpx", "xjkquk", "afyxhh" },

{ "vatflrk", "uxbhu", "gekygl", "xdyrvy", "wesoooi", "esphpt" },


{ "atbiby", "aqtog", "qjsvs" },






{ "vlqyxe", "rosfnb", "vphlxz" },
{ "bmdgthp", "kyfuyaf", "tzrqqk" },

{ "emuwzd", "ifyzcgi", "edotax" },


{ "ndkcn", "mkjuq", "ghcgz", "cxpwfir", "lxwvf", "nsghrq", "vyvrn" },

{ "gqhnstx", "xmedt", "brzucfh", "layqazp" },




{ "lzeud", "igkrktn", "oixlcn" },


{ "wbenaek", "gdunxee", "vgiqvsi", "bmlkhaf" },


{ "qklqozd", "otikjx", "wuvhyc", "dwejsn" },

{ "bnevesk", "dmglcj", "blnwcb" },













{ "djzjiwd", "zszzkl", "hrnrjrt", "hjmtrw" },

{ "shesfq", "ohdnhx", "uhnqr", "zdglrh", "ripilxo", "gfszte" },
{ "huzokb", "mnqii", "mieqti" },

{ "wcdibhx", "xvwvc", "ncmad", "jkgnvbn" },
{ "fxlbc", "mdqeh", "kmvcmg", "sonvcww", "pcckqq" },

{ "swugafb", "ryazls", "vmkeu", "fewrzd" },




{ "zzbad", "npccgnv", "yqnjd" },

{ "fvivo", "worqh", "yjzqr" },
{ "zuawuo", "jktlfu", "uhvtpfy", "ivlus" },

{ "mmhtyd", "yekmflj", "nmikggy", "xepgx" },




{ "xgfad", "zivlnu", "ipsst" },
{ "pafiy", "dhtxpbb", "dgcecu" },
{ "cblhmk", "ggmhxx", "tysdkgl", "rrvbwb" },







{ "wyylpt", "oneoorw", "cfbaj" },

{ "ghcgz", "tajfmq", "yzufk" },
{ "jjhrmi", "qhubjd", "uycop" },


{ "ugcccv", "wehdeq", "gyepcnc" },

{ "hyhbu", "sblfh", "ekvdv", "iicpkf", "xidtz" },















{ "yfegso", "yhsmjfq", "jzmacb", "autjn", "werkz" },

{ "rtsbgwx", "cbmqx", "hvmlb", "rsstvn", "jtyurkp", "gmkvgf", "qkawtfu", "ggwtf" },






{ "mzajj", "nljmcv", "waiwj" },

{ "agelbfq", "iuchai", "qynrx" },

{ "wtqxei", "afywb", "dqbfloz" },




{ "vsunxw", "pdbykx", "dnynny", "pqjua", "jhnujj" },

{ "upuybrd", "dnrjb", "rfknc", "bbeyl" },







{ "ctaazgn", "hywzja", "pywmbis" },















{ "ifuvyo", "zvszwl", "utewfcr", "dtmbf" },






{ "sblfh", "gglxj", "fqswta" },
{ "gbldz", "xitcp", "jpynea" },
{ "hmjpa", "elovaun", "uijgiu", "apxgf", "nlacdac" },





{ "gklehu", "sazbmjz", "piexct" },

{ "jxfimbl", "nvpdisw", "kioga" },
{ "vymmkdf", "ofqbu", "sboms", "obbpd", "czafdho" },
{ "jpwtbds", "zwutlym", "qntzr" },
{ "xsztla", "cmdizw", "qxkhq", "nfcbi", "rtutzu" },



{ "yvdhwyh", "xpewzk", "hdxrbzc", "vsaejz", "pudso" },



{ "ckmftuc", "khixdho", "ihzsljz", "uvkxner" },


{ "zofjia", "gshsx", "ntkpthi" },
{ "vyvrn", "lrjbgd", "vwojto" },
{ "tszockk", "ctaazgn", "gqbwc", "wcdibhx", "cujimpt" },

{ "hcxwql", "lpoejf", "cmvofka" },


{ "aonfn", "kzkfcn", "eefyyr" },




{ "khwbzl", "zlbnkdc", "ljmrml", "roqfxg" },



{ "yapaib", "gunvu", "ymdmn" },
{ "saawhdk", "vwvowk", "ilcsp", "vatflrk", "iajts" },

{ "ztmmr", "ypkhqlq", "uitfx" },

{ "sgrhs", "zymggc", "wnvrg" },
{ "hqjinj", "skuazsw", "ewwfzg" },
{ "vmpnccn", "bidhw", "qriyeb", "xsyzhcf", "ehjjbu" },



{ "znzbkh", "swnan", "tbioyr" },
{ "gnjit", "dhfagjw", "xxnpoe" },
{ "qojhhod", "sjdanf", "hmjpa", "szglq" },
{ "aluqao", "lyhlx", "ouhuptm" },


{ "tsxfibs", "yfnkp", "edjlm", "txbgfm" },
{ "pcumn", "qwcyozf", "dskuj", "anoxh", "dkmkdfd", "fkapr" },
{ "mejwrm", "oxsewk", "zsknxq" },






{ "rqisvrh", "bvmgt", "gbxxpd", "ffinat", "ympbbx", "uimoc", "shesfq" },

{ "cbmqx", "bnlbs", "psdzpg" },


{ "pwnqyt", "zijzutq", "yvdhwyh", "vbmyyrh" },


{ "pzwtjfj", "oyienb", "ozbjpiq" },
{ "ggmhxx", "fhhgts", "cepxc", "zwzxy" },






{ "fghxbc", "fozagvz", "wqgssb", "kqqsq", "oijwjli" },

{ "cubqfzc", "qwmqci", "dmvcduz" },



{ "mkjuq", "jdiczst", "edsjbi" },
{ "dhtii", "kfzqw", "lbozpy" },


{ "iuapj", "gzfrn", "wqtuhe", "fndyvvn", "zjveu", "iebulx", "agelbfq" },







{ "cvcblhv", "jbnns", "glkjrrs" },
{ "sdfvrod", "lcqfe", "uigcn" },
{ "xkfkucf", "skbrota", "pwvahdb", "odpqjr" },
{ "okkvefs", "fpuscxk", "zhdioii", "gzxnn", "koxnez" },



{ "xaogy", "ixknk", "ykvss", "hujjten" },


{ "cwnvk", "tvdsktm", "pwzsq", "plhlj", "ayqbj" },
{ "phbtrm", "hmmjjct", "xzvln" },


{ "tysdkgl", "mrwbv", "llkaoeh" },
{ "fpuscxk", "ypdumo", "lvdrrk" },
{ "ejkumeu", "xypffi", "nvcafwu", "cvdows" },

{ "cjjynt", "rkwhbhr", "axjvvur" },


{ "nuxxmd", "lybaepp", "eolqn" },

{ "hbbpuc", "thrvlt", "ziiqv" },
{ "tbley", "nvfca", "nojly", "nguafeb" },

{ "tywzxwb", "lbhlxqa", "dklujy", "vzxktth" },

{ "qwcyozf", "igzvp", "vtefqb" },




{ "jobwpao", "pqgiox", "uloppmh" },

{ "amsfvm", "nqgbp", "bcldmsg" },
{ "dfxjjzr", "udaitd", "sdktm" },





{ "gmkvgf", "tykwy", "dlobfkw", "aynpyne", "vaovit" },



{ "ygvpk", "saawhdk", "svthizp", "abamn" },

{ "rqvvv", "pzbxpou", "rxzfdg" },
{ "pozua", "vljjqbw", "hmlbrz" },


{ "twway", "orclyi", "hmdxion" },










{ "zdglrh", "csrww", "haqaohl", "gskveo", "qoetrb" },


{ "ymeoz", "lbxrh", "lsxjl" },




{ "znely", "qcmnpm", "yjutt", "yqgesx" },




{ "tyysd", "cjjynt", "lzeud", "wyylpt", "pewxc", "ibevwow", "fvmeeas", "uksnrfx" },






{ "btpvxq", "urktg", "ifnkl", "hbbpuc", "casmwo", "ylqvuk", "dblmcye", "zvpboy" },


{ "whvvemg", "tafss", "vnfigul" },


{ "koxnez", "bolpsk", "pefzsea" },

{ "wesoooi", "pmadd", "welidg" },

{ "eadvs", "ofnewz", "neywe", "qklqozd", "ykmfoah" },


{ "kuufl", "aonfn", "cgrima", "lhfuku" },
{ "qswoy", "bklfmch", "xpwxo", "eoustfr" },
{ "rakfg", "fiynt", "opdtk", "qkhvu" },



{ "ilcsp", "pafiy", "phbtrm", "nwupf" },












{ "xmuxsr", "bjiuus", "qqjly" },

{ "zuoeh", "hbaxtai", "pmefov", "zfteizz" },
{ "sqxrad", "marord", "jbgxcj", "xsmyok" },

{ "ibevwow", "cvnabd", "pbckxv", "xrunic", "ezsnmw" },
{ "rqilp", "quwfos", "vekxdqh" },


{ "sygjhzp", "hsxhyf", "knqxdq" },
{ "pjvnmqn", "azoutv", "jwhcmc" },




{ "aqgtml", "wywxu", "tiikt", "uwnwp" },
{ "fhjysp", "czvyrzi", "nbmnwsq" },




{ "uksnrfx", "bkkwe", "sbfprua" },



{ "xdyrvy", "wyois", "cwkdlil" },
{ "gbxxpd", "rynmge", "hngao", "vlqyxe", "jhyjqxq" },

{ "zfteizz", "ytvjxq", "vhoasjq", "fwwub", "xglsp", "cubqfzc", "nfucnzx" },

{ "jgrsa", "ukfsn", "kptjhtd" },
{ "uisnk", "tbley", "eqkot", "tlmfw", "gnjit" },

{ "zjveu", "qhyfphs", "bfwnv" },



{ "zdqmuey", "ibkfqok", "lhmgw" },








{ "skbrota", "toeyz", "gjcibb" },
{ "hbaxtai", "zynpp", "ylbaxtu", "rfwaq" },
{ "hvdfq", "imohij", "pwetqid" },



{ "bqywl", "ooufod", "clqqyi" },

{ "krwgy", "dllzp", "xqpfvwx" },





{ "tckyc", "dzfclsm", "sqxrad", "qkrpzl", "ppcsoo", "rqvvv" },
{ "qbftkij", "rtcfcyn", "vlmihf" },


{ "wzbqh", "xratfed", "fjcobs", "enlctw", "pklcmix" },
{ "qqnmzb", "mzyqoc", "soirl", "dhtii", "ahbcl" },






{ "rfwaq", "nmuxe", "ttofoep" },




{ "qcxiehu", "eeune", "gbldz", "ztmmr" },

{ "uimoc", "crhojk", "ejkumeu", "lovaf", "fhjysp", "uxbrs", "qbftkij" },
{ "phtghp", "rpjozji", "swnafht", "swugafb", "guyrnpn", "evbtz", "hyhbu" },
{ "svthizp", "saddwx", "olhnx", "uisnk", "iuapj", "btpvxq", "iovxjv" },

{ "ovpzt", "dfywz", "emtjcx" },

{ "hmpisyb", "igdtz", "lnmhw", "ttpmzgm", "dkxzsaq" },

{ "iedfk", "ydqqgrw", "bdiiv" },
{ "nomeb", "mmfuve", "lxudoaz" },

{ "gsgwqk", "ddraicf", "dgyulo" },






{ "itqwz", "rhacrz", "keusrg" },
{ "xbidr", "pozua", "gisiv", "skpux", "tcmdaji", "gorpw", "yfegso", "waakcx" },

{ "ryazls", "zhpfgzv", "rvpxob" },

{ "xwkyrer", "srnnjbb", "qcxiehu", "gqhnstx", "ghdbwu" },


{ "gdylf", "jlcie", "hewatw", "sdpsl" },
{ "vksyy", "wfpzhfz", "phsmt", "zuwaw" },

{ "qzglav", "ubxvdq", "aqvtgi" },
{ "xsoqzbe", "llgbz", "itqwz", "yxzlpnj" },



{ "uytsra", "hkgxpgh", "gzxddd" },
{ "zszzkl", "ifyja", "cdqdm", "rwmdbn", "exwzzr", "leyikdx" },





{ "fbzvm", "vgexqw", "cejtpyf" },
{ "aduikk", "kmfel", "paopwt", "hdjzg", "qckzqv" },
{ "shlfz", "swcvn", "obwkzhc", "pcumn" },


{ "iajts", "izzzyqd", "fegaac", "jagdwg", "mblvpm" },
{ "kxwbdvm", "mzajj", "ubuge", "ddguar", "znzbkh" },
{ "rynmge", "ecwjaw", "zdqsmv", "aodoc", "pxfrz" },
{ "bqxnoid", "aqgtml", "qprenhy", "upuybrd", "sgrhs", "flptbw", "mxwbp", "boszym" },




{ "bamxvq", "zywvdda", "ygnkwn", "taxrkif" },

{ "vhoasjq", "uogva", "tuvehcz" },




{ "ypbrxyq", "siqcu", "kqicqf" },










{ "ppcsoo", "gwqgewp", "lsgbe" },


{ "xidtz", "azuoza", "coselm" },


{ "fqqyipa", "eeshl", "cxqeyt", "qkhqrq" },

{ "xhzyzer", "pawvr", "dckbvlg" },
{ "boszym", "rqrhrnz", "beewze", "evqibrc" },



{ "klovr", "kihqh", "wafjqj" },


{ "wzqanwj", "zavcu", "hsmjm" },
{ "uxbrs", "qekxzsx", "odqns" },


{ "wwxak", "vbmqj", "ugavy" },





{ "faijmsh", "rwakmo", "nwikfyc" },

{ "sjgvkg", "cldaag", "bjwvw", "dpqxfp", "dgdtt", "ujbzq" },







{ "tsamaj", "axgndac", "vbuvkx", "uqeag", "qyurm", "lzypz" },


{ "ddwursx", "sdwrx", "jtfylv" },



{ "ylbaxtu", "frcrd", "shjxje" },

{ "yzhvrx", "viqvtzw", "twway", "zwzzce", "hqjinj", "mejwrm", "yyursb", "gfigt" },

{ "locrtxl", "xsoqzbe", "oxoocfp", "ndkcn", "vmeubf" },

{ "rylaxjf", "ojfzokk", "iksaub" },


{ "alhlvth", "zirysk", "orpjw", "zdxscz" },


{ "bjvuicy", "xjyyfe", "rahgf", "qqllir" },
{ "hepkop", "xkfkucf", "xbidr", "yvgkdi" },
{ "gqbwc", "ytxcti", "qubli", "cpmebw", "wzvzgg" },
{ "yojcz", "rkjuz", "rmlru" },
{ "obwkzhc", "vksnq", "tijwlva", "szcozjr", "krwgy", "pnhpv", "ydiicdl", "kskts" },
{ "cdqdm", "wnfqsa", "jbqmy", "hvdfq" },


{ "phsmt", "jqpdpr", "bmnsmqz" },



{ "ktayld", "skfnp", "xwjmsjr" },


{ "jljjai", "fhycptc", "olepfo", "armfpvt" },




{ "vlbivgc", "xcxqa", "aeatvub", "pwmrau", "rqisvrh", "hepkop", "ogmoqb" },

{ "mblvpm", "fbmajm", "ofwbsgp" },

{ "fegaac", "ffsehyc", "sapwhr" },

{ "gisiv", "hmjueiq", "unqui" },







{ "bljkg", "yivjj", "cxcyrd", "lorxjw" },
{ "fkapr", "wwofru", "weyfsg", "khtooum", "ohsyhln" },






{ "gorpw", "jnrnwos", "rsdub", "uaffk" },
{ "skmbdhz", "scqtkga", "xdojlm" },
{ "ecaiau", "rakfg", "ddwursx", "nsbzfgy" },



{ "qkrpzl", "kjonvut", "clbbi" },

{ "iicpkf", "vhkydm", "htecpc" },

{ "funnv", "cdlzi", "fpfpv", "bqxnoid" },




{ "izdhn", "uytsra", "xxmtvr", "bljkg" },
{ "hrnrjrt", "kuufl", "khwbzl", "tocvooe" },
{ "eiatt", "gfhummb", "jsmde" },



{ "qzzlmw", "szrkuzi", "cpeonw" },

{ "iftyxdd", "xmaqelf", "htqps" },

{ "uytsdd", "hyehtm", "zdissfg" },

{ "ylqvuk", "shdgsk", "fcdcdh", "kiylza", "arskvgv" },


{ "rwmdbn", "xmuxsr", "bfkbp", "ibjdru", "ttvfha", "zhohes" },



{ "leyikdx", "ewswf", "gaashgh", "cwnvk" },
{ "kcbwrrr", "wzbqh", "sysdxvb", "huzokb", "ifuvyo", "ghakp", "rqqlzs" },



{ "hiyswbt", "ileugiu", "suuhqpd", "yffhk", "htstksc" },


{ "pewxc", "rmexd", "wkmtw" },



{ "cujimpt", "ovszp", "zsqzm" },
{ "htstksc", "wsixz", "egszxz", "gzjut", "rutqzk" },



{ "sybpg", "sdyox", "dwrwuoq" },


{ "zihpcn", "jukxlr", "louebj" },
{ "zxygs", "njvkdrp", "hqqingt" },





{ "yhfpq", "cxyfam", "mjumixz" },


{ "howlyws", "gwyljq", "xhhwwso" },




{ "tvrxaw", "qdqtw", "qpsirr", "dbczwnr" },






{ "zwzzce", "ahqfu", "gjedup", "evhhfo", "rpvwtq" },
{ "rrvbwb", "wcmyn", "haclvfu" },


{ "otipr", "gdrxgji", "fonrd", "wqoae" },
{ "qxkhq", "ixqrl", "jsrrt" },






{ "hilafgl", "hmpisyb", "ktayld", "yapaib", "bmdgthp", "qzzlmw" },









{ "iovxjv", "uhwnr", "ypbrxyq", "dfxjjzr", "pxkypf", "nobfn", "tkdvenx", "sdfvrod" },

{ "qprenhy", "cxfsoh", "mrmbyj" },
{ "qmwmbsk", "tmoui", "amtayi", "wgqpt", "xaycmtu", "kztkif" },


{ "jkkqxfr", "nomeb", "fbzvm", "gklehu" },


{ "ggwtf", "vkaay", "kxdehcg" },

{ "xglsp", "ljhlxc", "htpblzv" },


{ "exwzzr", "bchixdc", "fphmu", "hcxwql" },

{ "uevxbyn", "ucaee", "yuikqm" },






{ "abamn", "tsamaj", "qojhhod", "kcbwrrr", "ttfyrk", "qqnmzb", "tyysd", "sjgvkg" },
{ "sjdanf", "ldbkyg", "brtomr", "qwfvm" },





{ "vksnq", "vqddcl", "ezqeusd" },







{ "rsstvn", "bpcnzi", "cvpuwrb" },



{ "pwmrau", "roogi", "ajcbzv", "pwnqyt" },


{ "mzyqoc", "yxgwsj", "fwabsk" },
{ "tkdvenx", "sppxnti", "lncmhi", "jmrlaxf", "qmati" },





{ "izzzyqd", "djvfa", "qrrvi", "junfev" },
{ "lsire", "locrtxl", "shlfz", "ycpcv" },
{ "vbuvkx", "tlxekcp", "pxdkes" },


{ "aeatvub", "hghjsk", "vksyy", "otipr" },

{ "cxpwfir", "mhpzrw", "txwzysl" },

{ "zlbnkdc", "lfavcfd", "lkreb" },

{ "casmwo", "nsbnixe", "vntsex" },
{ "rqqlzs", "lfdefc", "isqvoex" },








{ "flptbw", "xmgqmv", "ciprksz" },

{ "jbqmy", "zxhqlfy", "ehhbjt" },

{ "zzflc", "rnyndr", "eiatt", "fvivo", "gdylf" },


{ "qyurm", "eauxeyl", "nrwmjk", "qxkvfid", "rjmuly" },


{ "qfcetm", "iqoxkhd", "gptyqwd" },





{ "yvgkdi", "pjvnmqn", "kgoyufq", "zivjpfo", "amsfvm" },







{ "cxiturs", "ttoer", "jpwtbds", "yykkph", "yffpvf", "ahjlf", "yoxetv", "okkvefs" },
{ "fewrzd", "efuysje", "olrgu", "rtmiw" },



{ "roogi", "cesnj", "wsvfkr", "hzhcl" },
{ "yffhk", "jfcoc", "vpltn" },
{ "ffinat", "avyoy", "tywzxwb", "zuawuo", "vsunxw" },


{ "bxmcg", "epggt", "gfjsie" },
{ "kdeqm", "qjbbyb", "ikaol" },
{ "lfsvtih", "aylxc", "bekguie" },

{ "zzfcq", "balknnd", "iiqzvha", "kzzfvt", "ecaiau" },
{ "kebhn", "iktmpdq", "sreke", "cjbdxts", "ehlnex" },
{ "ljmrml", "fxhqq", "ybioco" },



{ "fvmeeas", "wdipy", "khnjt", "kmwxj" },

{ "wsvfkr", "liznr", "yytpewc" },


{ "uhnqr", "oncexf", "jeiqx" },
{ "xzmdis", "yhjhgu", "vqnyvr", "taacpu" },


{ "cgrima", "xvayjwv", "eyxccr", "xtqthxs", "qzftgbx" },

{ "yjutt", "jocmdmv", "iaoyb", "aecsfp", "mxbrva" },

{ "fwwub", "defbun", "wcjnjpf" },




{ "xdctkbj", "zuoeh", "tnqram", "funnv", "zzfcq", "xwkyrer", "cxiturs", "phtghp" },




{ "gxddhu", "itlwpm", "bdnjn" },
{ "zvpboy", "txrfl", "egxzjn", "iwouvid", "cjxyp" },
{ "fndyvvn", "khtegw", "aocfuj", "mipqe", "lnknp" },

{ "kxizh", "yojcz", "uafhv", "wnpnfiv", "kivyltn", "jxaorvd" },


{ "jagdwg", "ytiljvt", "smascq" },


{ "afbzsz", "vzcklke", "ggvwlp" },













{ "kzzfvt", "aluqao", "oherzyz", "dwnokzu" },
{ "uqeag", "prlvn", "xtaoisd" },
{ "crhojk", "yffeit", "yfusbw", "oykwsk" },
{ "oxoocfp", "igqle", "eukgf", "qzglav", "ipysrdj", "gsgwqk", "kevlq" },




{ "ogmoqb", "uqmgmst", "hiyswbt", "qmwmbsk", "skmuo", "tszockk", "kxizh", "thbwh" },

{ "xaycmtu", "cnwzxpy", "helyfoo" },

{ "wqtuhe", "myookpi", "gqikhhw" },






{ "cesnj", "hrokzl", "rtgobsq", "kmfsmp", "chyhykz" },













{ "rpjozji", "faijmsh", "xzmdis", "arelp", "guvke", "rqilp", "eqpuuzs" },










{ "nfcbi", "zocwx", "mjtji" },










{ "fefuzon", "jenfafh", "cauig" },




{ "uxbhu", "bxwng", "ozvtqp" },
{ "gzfrn", "mprgtb", "qkicc" },
{ "qlwhsix", "bjwny", "ghapm" },




{ "yyursb", "lqcutyt", "uuvtlk" },








{ "ifwmfdm", "jibemf", "wtfliw" },

{ "ujbzq", "izvtqsa", "ssnhc" },

{ "bvmgt", "xqncgyu", "tsxfibs", "zofjia" },








{ "wnpnfiv", "tehat", "ttbuzrh", "jfieeor" },


{ "dgdtt", "qface", "yhvndwy" },


{ "vmeubf", "sygjhzp", "ilhib", "ldgyqh", "uewdyd", "skmbdhz" },


{ "ibjdru", "dzqqgbm", "qivxs" },

{ "kqiuy", "ffuqr", "rplcrt", "gmuwpyi", "zsukqjo" },
{ "gfszte", "pxgkg", "zehkwy", "pwnxw", "uqfbnlo" },

{ "fphmu", "jpvxzcn", "xvzinl", "pvyvx", "lxgvhy" },
{ "yxzlpnj", "iyfyi", "jhcwkl" },

{ "pjjmau", "hktzoq", "oigsk" },


{ "nsghrq", "bvmgrs", "bsfygp" },

{ "nsbzfgy", "mplhwo", "qvdid" },
{ "hngao", "olhfbr", "qgxgzo" },
{ "iitbuxz", "eexmf", "emuwzd", "zzbad" },
{ "ywnsmem", "qjuuu", "ohuvsf" },


{ "uafhv", "azmneyd", "mmpnppi" },


{ "eionkb", "hxmcaoy", "sybpg", "jfhqrla" },
{ "hzhcl", "vgegr", "lklqxg" },

{ "ttfyrk", "xnxsdq", "ffgzg", "tvrxaw" },


{ "ajcbzv", "jjhrmi", "jljjai", "afbzsz" },
{ "ydiicdl", "iqbdxb", "fpgyyu" },


{ "urktg", "pxgcbfi", "lacddy", "hvisx" },



{ "kgoyufq", "holen", "gjctf" },


{ "gyfbgkr", "gyoqtcg", "lovox", "srzfd" },

{ "wfpzhfz", "zyfwjxs", "evdwf" },
{ "rnyndr", "kklbcs", "ygkdmh", "cifdyio" },
{ "xqncgyu", "nzhqepw", "satjdgz" },
{ "hvmlb", "qwxwd", "huvihu" },

{ "suuhqpd", "ccpnopa", "lqlyf", "fxpoal" },
{ "djviima", "qyhvc", "kjoru", "myopc" },
{ "ddguar", "adbxp", "jcise" },


{ "anoxh", "hfmaqp", "ggfmiv" },

{ "mhxheb", "rkfspx", "uatlbrq", "cvnrr", "bwpeux" },


{ "yffpvf", "pwoyfeh", "zklbfdg" },

{ "tocvooe", "fqqyipa", "zihpcn", "wzqanwj", "wajnseu", "bnevesk", "wwxak" },

{ "rvixnmq", "fyouz", "nsnqedk" },
{ "uhwnr", "zjzgs", "mpijr" },




{ "amtayi", "qsvbb", "scxdo", "inlrm" },
{ "vbmyyrh", "uwjowb", "naekrk" },
{ "gomcbqb", "lofayaa", "iltoh" },

{ "wajnseu", "kxyfb", "vmboh", "zguzlx" },
{ "hghjsk", "fixwkec", "gcowt" },

{ "guvke", "brjgwq", "kejtzg" },


{ "dblmcye", "bffnszc", "zxgrq", "ngxtfhu" },
{ "ahbcl", "hebhue", "edlved", "tafhilv", "iblvki" },



{ "ejvipa", "kpayh", "uzvsml" },
{ "oherzyz", "yhxlzc", "fkwbo", "ziyyc", "dlfmj" },
{ "kivyltn", "vxede", "pjazwiy", "ruozk", "sydjg" },
{ "szcmb", "bjyraf", "bvypab" },

{ "xmzzrgs", "aewmad", "jefjzvl" },


{ "wgqpt", "evcveie", "ccter" },
{ "yykkph", "gyfbgkr", "fghxbc", "qswoy", "gomcbqb", "tubhp", "zdqmuey", "gxddhu" },
{ "yoxetv", "eeziziu", "kaghlc" },



{ "cdlzi", "wtqxei", "mhxheb", "nuxxmd" },

{ "ghakp", "sagyrje", "fxaglf" },

{ "bchixdc", "khdbe", "uuyfecv", "pnouux" },
{ "olhnx", "vymmkdf", "qfcetm", "atbiby", "tcpduh", "ymeoz" },




{ "fpfpv", "fxlbc", "alhlvth", "yhfpq" },
{ "lzypz", "rnqgy", "csyiik" },

{ "rfcbs", "oajdx", "yeaic" },
{ "cmdizw", "ydzibri", "syliku" },
{ "iiqzvha", "hnedp", "iwicpur" },

{ "neywe", "lmlsog", "svanha", "sadnqcp" },




{ "ofnewz", "pryhgj", "tcjqw" },


{ "jhyjqxq", "jlofqwz", "bhfui" },

{ "kskts", "gdkjoit", "lmkwafp" },







{ "mxwbp", "fggyk", "mefmo" },



{ "aumrixf", "ifualyn", "kgqzrt", "mhjeza", "wfvjnxf" },
{ "gfigt", "iiugq", "zgfqdv" },


{ "locto", "oginzo", "twgjdmg" },
{ "vopqzha", "kglsx", "qsjqlp", "flkkr", "fbpbs" },
{ "lxwvf", "ixxww", "mxnlv", "waqca" },
{ "zuwaw", "tbaads", "xjadrfg" },

{ "tubhp", "uftnfv", "vgemekb" },




{ "ldgyqh", "mriqcjy", "khgvmj" },






{ "nfucnzx", "nvfqmkw", "asozcan" },
{ "znwmvr", "ymataqq", "etfbuu", "wbqeo", "gcydgf" },

{ "eukgf", "rdvciwk", "ulchkal" },
{ "skpux", "vwftcva", "perzy" },
{ "uewdyd", "uamqx", "gnughzp" },

{ "guyrnpn", "bqywl", "cvcblhv", "ovpzt", "qlwhsix" },





{ "uqmgmst", "kdeqm", "znwmvr", "iftyxdd" },
{ "tijwlva", "gxsxqwt", "yjrfr" },




{ "jkkwtd", "jhwrcb", "pbkplz", "momda" },



{ "soirl", "uqjfarv", "myqre" },

{ "rtutzu", "crcrimv", "fxrijc" },
{ "pmefov", "gibdxij", "whvvemg", "lfsvtih", "ckmftuc" },
{ "tnqram", "kxwbdvm", "rhcxf", "nihiexp" },
{ "dzfclsm", "yxemuyq", "mptovq" },



{ "xnxsdq", "ukqmhyc", "teduvv", "lmhamlz" },

{ "lovaf", "osjsm", "wptyd" },
{ "rhcxf", "jgrsa", "egtruqh", "kqiuy", "aduikk" },





{ "balknnd", "kebhn", "bamxvq", "xaogy", "fefuzon" },

{ "zynpp", "qahzrif", "rlfqf", "hekibe" },
{ "szglq", "iezyfwf", "jmypc", "rsizei", "jpyvpw" },

{ "wuknah", "kczlit", "nggtuh", "umgch", "xkxqc" },
{ "ifnkl", "kabqu", "ujjoydl" },
{ "eqkot", "aljgr", "lnwcryv" },




{ "zkpfzio", "vrbcn", "kasaf", "hhqmsd", "idrror" },
{ "evbtz", "ifwmfdm", "rylaxjf", "oylvq", "locto" },
{ "srnnjbb", "zxygs", "rkwquj", "owxawf", "ahfdt" },
{ "viqvtzw", "gmirjhi", "aucjw" },

{ "wiapj", "djzjiwd", "lsire", "vlbivgc", "xdctkbj", "ygvpk" },


{ "eqpuuzs", "gisrnfs", "rpqbv" },
{ "kevlq", "xkzvo", "xxego" },





{ "axgndac", "zdnypzo", "sglkjsh" },


{ "tmoui", "ceeotg", "ejxib" },
{ "xxmtvr", "ofxzyhr", "dzxpqj" },
{ "zijzutq", "wuclmu", "citaywz", "ljjyy" },

{ "szcozjr", "bgehlas", "pocvrcs" },
{ "jfhqrla", "miwst", "elgtk" },


{ "eeune", "ysafyj", "vlyof" },


{ "swcvn", "sjaax", "szcmb", "klovr" },







{ "dkmkdfd", "vvkkkpb", "ulragq" },




{ "rkwquj", "gvamhux", "dtfdn" },




{ "ttoer", "howlyws", "wuknah", "bjvuicy" },


{ "ghdbwu", "ifbhg", "nqicerc" },
{ "thbwh", "rfcbs", "hioofm", "jspui" },




{ "saddwx", "bxmcg", "vmpnccn", "pjjmau" },

{ "qkawtfu", "ujuunj", "iugsida" },


{ "gekygl", "zafggcz", "rbuwrpw" },
{ "egtruqh", "ocppbp", "gwbfat" },

{ "ympbbx", "spwqxpy", "iedfk", "ugcccv", "djviima", "xgfad" },
{ "pxkypf", "hblux", "nemrt" },


{ "gibdxij", "ohsvn", "wkamonm" },


{ "ekvdv", "kpvbt", "nnmayb" },


{ "dskuj", "slahk", "zytau" },
{ "yqgesx", "zcomxf", "bmqhvfv", "hwdtvvc", "laopkn" },





{ "sysdxvb", "zmkwnv", "pcecbrn", "hregcx", "muptknj" },
{ "nihiexp", "vopqzha", "uytsdd", "uevxbyn" },

{ "nwupf", "cuprzhk", "ozhydny" },

{ "pwvahdb", "yybnbso", "tzhwvzt" },


{ "zhohes", "wrlkfij", "xlkwyg" },

{ "vwvowk", "dgosy", "zvgsa" },

{ "kztkif", "mtflvu", "oothjv" },
{ "ycpcv", "izdhn", "yzhvrx", "eionkb", "eadvs", "jkkqxfr" },

{ "esphpt", "emwblax", "dfiyju", "qryui", "eydak" },





{ "ilhib", "pubtxq", "lpsafeq" },


{ "swnafht", "lbxdtms", "jensj", "zkpfzio", "jobwpao", "jxfimbl" },
    };

    HashMap<String, Integer> parentProgramValueMap = getParentProgramValueMap(linkedPrograms, progamValueMap, getRootProgram (allNames, linkedNames));
    System.out.println(parentProgramValueMap.get("swnafht"));
    System.out.println(parentProgramValueMap.values());


    String[] allNamesSmall = {
      "pbga",
"xhth",
"ebii",
"havc",
"ktlj",
"fwft",
"qoyq",
"padx",
"tknk",
"jptl",
"ugml",
"gyxo",
"cntj"
    };

    String[] linkedNamesSmall = {
      "ktlj", "cntj", "xhth",

"pbga", "havc", "qoyq",
"ugml", "padx", "fwft",

"gyxo", "ebii", "jptl"
    };

    System.out.println(getRootProgram (allNamesSmall, linkedNamesSmall));
    
    String[][] programValuesSmall = {
      { "pbga","66" },
{ "xhth","57" },
{ "ebii","61" },
{ "havc","66" },
{ "ktlj","57" },
{ "fwft","72" },
{ "qoyq","66" },
{ "padx","45" },
{ "tknk","41" },
{ "jptl","61" },
{ "ugml","68" },
{ "gyxo","61" },
{ "cntj","57" },
    };
    HashMap<String, Integer> progamValueMapSmall = getProgramValueMap(programValuesSmall);
    System.out.println(progamValueMapSmall.get("tknk"));

    String[][] linkedProgramsSmall = {
      { "fwft", "ktlj", "cntj", "xhth" },

{ "padx", "pbga", "havc", "qoyq" },
{ "tknk", "ugml", "padx", "fwft" },

{ "ugml", "gyxo", "ebii", "jptl" }
    };
    HashMap<String, Integer> parentProgramValueMapSmall = getParentProgramValueMap(linkedProgramsSmall, progamValueMapSmall, getRootProgram (allNamesSmall, linkedNamesSmall));
    System.out.println(parentProgramValueMapSmall.get("ugml"));
    System.out.println(parentProgramValueMapSmall.values());
  }
}
