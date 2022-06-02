import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void test_human() {
        // test Human
        assertEquals(Dijkstra.dijkstra("STWSWTPPTPTTPWPP", "Human"),
                Solution.getResult("STWSWTPPTPTTPWPP", "Human"));
        assertEquals(Dijkstra.dijkstra("TSWPPTWSSWPTPSSS", "Human"),
                Solution.getResult("TSWPPTWSSWPTPSSS", "Human"));
        assertEquals(Dijkstra.dijkstra("WPPTTWWTSWPTPSWP", "Human"),
                Solution.getResult("WPPTTWWTSWPTPSWP", "Human"));
        assertEquals(Dijkstra.dijkstra("PPWPPSSTPPSSSPTT", "Human"),
                Solution.getResult("PPWPPSSTPPSSSPTT", "Human"));
        assertEquals(Dijkstra.dijkstra("TTTWWPWTTSSSSWTT", "Human"),
                Solution.getResult("TTTWWPWTTSSSSWTT", "Human"));
        assertEquals(Dijkstra.dijkstra("SWTTTWPWTSSPTTSS", "Human"),
                Solution.getResult("SWTTTWPWTSSPTTSS", "Human"));
        assertEquals(Dijkstra.dijkstra("PSSWSSWTWTWTTSSP", "Human"),
                Solution.getResult("PSSWSSWTWTWTTSSP", "Human"));
        assertEquals(Dijkstra.dijkstra("TPSWWSSTPTPWTWST", "Human"),
                Solution.getResult("TPSWWSSTPTPWTWST", "Human"));
        assertEquals(Dijkstra.dijkstra("TSSPTTPWPWTPSPPP", "Human"),
                Solution.getResult("TSSPTTPWPWTPSPPP", "Human"));
        assertEquals(Dijkstra.dijkstra("SPSPWSWSWTWPSTPS", "Human"),
                Solution.getResult("SPSPWSWSWTWPSTPS", "Human"));
        assertEquals(Dijkstra.dijkstra("STSSTPSWPWSWTWWW", "Human"),
                Solution.getResult("STSSTPSWPWSWTWWW", "Human"));
        assertEquals(Dijkstra.dijkstra("TSTSPSTWSTTPPWSP", "Human"),
                Solution.getResult("TSTSPSTWSTTPPWSP", "Human"));
        assertEquals(Dijkstra.dijkstra("SWPTTTSSWSPWSWWW", "Human"),
                Solution.getResult("SWPTTTSSWSPWSWWW", "Human"));
        assertEquals(Dijkstra.dijkstra("PWWPTWPPWTWWSTPP", "Human"),
                Solution.getResult("PWWPTWPPWTWWSTPP", "Human"));
        assertEquals(Dijkstra.dijkstra("WPPSSSSSWSTWSWSS", "Human"),
                Solution.getResult("WPPSSSSSWSTWSWSS", "Human")); //
        assertEquals(Dijkstra.dijkstra("WSSSWTPTPWPTPWSS", "Human"),
                Solution.getResult("WSSSWTPTPWPTPWSS", "Human"));
        assertEquals(Dijkstra.dijkstra("PPSPSPTWPWTSTWPT", "Human"),
                Solution.getResult("PPSPSPTWPWTSTWPT", "Human"));
        assertEquals(Dijkstra.dijkstra("PSSPPWTTWTPPTWPT", "Human"),
                Solution.getResult("PSSPPWTTWTPPTWPT", "Human"));
        assertEquals(Dijkstra.dijkstra("SPPTWPWSSSTSTWWP", "Human"),
                Solution.getResult("SPPTWPWSSSTSTWWP", "Human"));
        assertEquals(Dijkstra.dijkstra("WPSSPWTWTTPTTSPT", "Human"),
                Solution.getResult("WPSSPWTWTTPTTSPT", "Human"));
        assertEquals(Dijkstra.dijkstra("WWTPWWSPSWWTPTTP", "Human"),
                Solution.getResult("WWTPWWSPSWWTPTTP", "Human"));
        assertEquals(Dijkstra.dijkstra("SPWSSPWTTSTPTWTT", "Human"),
                Solution.getResult("SPWSSPWTTSTPTWTT", "Human"));
        assertEquals(Dijkstra.dijkstra("SPTSTTTWTSWPPWWP", "Human"),
                Solution.getResult("SPTSTTTWTSWPPWWP", "Human"));
        assertEquals(Dijkstra.dijkstra("SPWWWTSTTPSSTSTP", "Human"),
                Solution.getResult("SPWWWTSTTPSSTSTP", "Human"));
        assertEquals(Dijkstra.dijkstra("SPWWWTSTTPSSTSTP", "Human"),
                Solution.getResult("SPWWWTSTTPSSTSTP", "Human"));
        assertEquals(Dijkstra.dijkstra("WWSTSTSSPTPTWSPP", "Human"),
                Solution.getResult("WWSTSTSSPTPTWSPP", "Human"));
        assertEquals(Dijkstra.dijkstra("TTSTSPWWTTSWPSWP", "Human"),
                Solution.getResult("TTSTSPWWTTSWPSWP", "Human"));
        assertEquals(Dijkstra.dijkstra("SPPWWWTWTWTSPWTW", "Human"),
                Solution.getResult("SPPWWWTWTWTSPWTW", "Human"));
        assertEquals(Dijkstra.dijkstra("PTSSWPPWSSSWPTTW", "Human"),
                Solution.getResult("PTSSWPPWSSSWPTTW", "Human"));
        assertEquals(Dijkstra.dijkstra("PTSPTPWSPTWWWPWW", "Human"),
                Solution.getResult("PTSPTPWSPTWWWPWW", "Human"));
    }

    @Test
    public void test_swamper() {
        // test Swamper
        assertEquals(Dijkstra.dijkstra("STWSWTPPTPTTPWPP", "Swamper"),
                Solution.getResult("STWSWTPPTPTTPWPP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("TSWPPTWSSWPTPSSS", "Swamper"),
                Solution.getResult("TSWPPTWSSWPTPSSS", "Swamper"));
        assertEquals(Dijkstra.dijkstra("WPPTTWWTSWPTPSWP", "Swamper"),
                Solution.getResult("WPPTTWWTSWPTPSWP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PPWPPSSTPPSSSPTT", "Swamper"),
                Solution.getResult("PPWPPSSTPPSSSPTT", "Swamper"));
        assertEquals(Dijkstra.dijkstra("TTTWWPWTTSSSSWTT", "Swamper"),
                Solution.getResult("TTTWWPWTTSSSSWTT", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SWTTTWPWTSSPTTSS", "Swamper"),
                Solution.getResult("SWTTTWPWTSSPTTSS", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PSSWSSWTWTWTTSSP", "Swamper"),
                Solution.getResult("PSSWSSWTWTWTTSSP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("TPSWWSSTPTPWTWST", "Swamper"),
                Solution.getResult("TPSWWSSTPTPWTWST", "Swamper"));
        assertEquals(Dijkstra.dijkstra("TSSPTTPWPWTPSPPP", "Swamper"),
                Solution.getResult("TSSPTTPWPWTPSPPP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPSPWSWSWTWPSTPS", "Swamper"),
                Solution.getResult("SPSPWSWSWTWPSTPS", "Swamper"));
        assertEquals(Dijkstra.dijkstra("STSSTPSWPWSWTWWW", "Swamper"),
                Solution.getResult("STSSTPSWPWSWTWWW", "Swamper"));
        assertEquals(Dijkstra.dijkstra("TSTSPSTWSTTPPWSP", "Swamper"),
                Solution.getResult("TSTSPSTWSTTPPWSP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SWPTTTSSWSPWSWWW", "Swamper"),
                Solution.getResult("SWPTTTSSWSPWSWWW", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PWWPTWPPWTWWSTPP", "Swamper"),
                Solution.getResult("PWWPTWPPWTWWSTPP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("WPPSSSSSWSTWSWSS", "Swamper"),
                Solution.getResult("WPPSSSSSWSTWSWSS", "Swamper"));
        assertEquals(Dijkstra.dijkstra("WSSSWTPTPWPTPWSS", "Swamper"),
                Solution.getResult("WSSSWTPTPWPTPWSS", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PPSPSPTWPWTSTWPT", "Swamper"),
                Solution.getResult("PPSPSPTWPWTSTWPT", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PSSPPWTTWTPPTWPT", "Swamper"),
                Solution.getResult("PSSPPWTTWTPPTWPT", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPPTWPWSSSTSTWWP", "Swamper"),
                Solution.getResult("SPPTWPWSSSTSTWWP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("WPSSPWTWTTPTTSPT", "Swamper"),
                Solution.getResult("WPSSPWTWTTPTTSPT", "Swamper"));
        assertEquals(Dijkstra.dijkstra("WWTPWWSPSWWTPTTP", "Swamper"),
                Solution.getResult("WWTPWWSPSWWTPTTP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPWSSPWTTSTPTWTT", "Swamper"),
                Solution.getResult("SPWSSPWTTSTPTWTT", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPTSTTTWTSWPPWWP", "Swamper"),
                Solution.getResult("SPTSTTTWTSWPPWWP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPWWWTSTTPSSTSTP", "Swamper"),
                Solution.getResult("SPWWWTSTTPSSTSTP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPWWWTSTTPSSTSTP", "Swamper"),
                Solution.getResult("SPWWWTSTTPSSTSTP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("WWSTSTSSPTPTWSPP", "Swamper"),
                Solution.getResult("WWSTSTSSPTPTWSPP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("TTSTSPWWTTSWPSWP", "Swamper"),
                Solution.getResult("TTSTSPWWTTSWPSWP", "Swamper"));
        assertEquals(Dijkstra.dijkstra("SPPWWWTWTWTSPWTW", "Swamper"),
                Solution.getResult("SPPWWWTWTWTSPWTW", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PTSSWPPWSSSWPTTW", "Swamper"),
                Solution.getResult("PTSSWPPWSSSWPTTW", "Swamper"));
        assertEquals(Dijkstra.dijkstra("PTSPTPWSPTWWWPWW", "Swamper"),
                Solution.getResult("PTSPTPWSPTWWWPWW", "Swamper"));
    }

    @Test
    public void test_woodman() {
        // test Woodman
        assertEquals(Dijkstra.dijkstra("STWSWTPPTPTTPWPP", "Woodman"),
                Solution.getResult("STWSWTPPTPTTPWPP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("TSWPPTWSSWPTPSSS", "Woodman"),
                Solution.getResult("TSWPPTWSSWPTPSSS", "Woodman"));
        assertEquals(Dijkstra.dijkstra("WPPTTWWTSWPTPSWP", "Woodman"),
                Solution.getResult("WPPTTWWTSWPTPSWP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PPWPPSSTPPSSSPTT", "Woodman"),
                Solution.getResult("PPWPPSSTPPSSSPTT", "Woodman"));
        assertEquals(Dijkstra.dijkstra("TTTWWPWTTSSSSWTT", "Woodman"),
                Solution.getResult("TTTWWPWTTSSSSWTT", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SWTTTWPWTSSPTTSS", "Woodman"),
                Solution.getResult("SWTTTWPWTSSPTTSS", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PSSWSSWTWTWTTSSP", "Woodman"),
                Solution.getResult("PSSWSSWTWTWTTSSP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("TPSWWSSTPTPWTWST", "Woodman"),
                Solution.getResult("TPSWWSSTPTPWTWST", "Woodman"));
        assertEquals(Dijkstra.dijkstra("TSSPTTPWPWTPSPPP", "Woodman"),
                Solution.getResult("TSSPTTPWPWTPSPPP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPSPWSWSWTWPSTPS", "Woodman"),
                Solution.getResult("SPSPWSWSWTWPSTPS", "Woodman"));
        assertEquals(Dijkstra.dijkstra("STSSTPSWPWSWTWWW", "Woodman"),
                Solution.getResult("STSSTPSWPWSWTWWW", "Woodman"));
        assertEquals(Dijkstra.dijkstra("TSTSPSTWSTTPPWSP", "Woodman"),
                Solution.getResult("TSTSPSTWSTTPPWSP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SWPTTTSSWSPWSWWW", "Woodman"),
                Solution.getResult("SWPTTTSSWSPWSWWW", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PWWPTWPPWTWWSTPP", "Woodman"),
                Solution.getResult("PWWPTWPPWTWWSTPP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("WPPSSSSSWSTWSWSS", "Woodman"),
                Solution.getResult("WPPSSSSSWSTWSWSS", "Woodman"));
        assertEquals(Dijkstra.dijkstra("WSSSWTPTPWPTPWSS", "Woodman"),
                Solution.getResult("WSSSWTPTPWPTPWSS", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PPSPSPTWPWTSTWPT", "Woodman"),
                Solution.getResult("PPSPSPTWPWTSTWPT", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PSSPPWTTWTPPTWPT", "Woodman"),
                Solution.getResult("PSSPPWTTWTPPTWPT", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPPTWPWSSSTSTWWP", "Woodman"),
                Solution.getResult("SPPTWPWSSSTSTWWP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("WPSSPWTWTTPTTSPT", "Woodman"),
                Solution.getResult("WPSSPWTWTTPTTSPT", "Woodman"));
        assertEquals(Dijkstra.dijkstra("WWTPWWSPSWWTPTTP", "Woodman"),
                Solution.getResult("WWTPWWSPSWWTPTTP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPWSSPWTTSTPTWTT", "Woodman"),
                Solution.getResult("SPWSSPWTTSTPTWTT", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPTSTTTWTSWPPWWP", "Woodman"),
                Solution.getResult("SPTSTTTWTSWPPWWP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPWWWTSTTPSSTSTP", "Woodman"),
                Solution.getResult("SPWWWTSTTPSSTSTP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPWWWTSTTPSSTSTP", "Woodman"),
                Solution.getResult("SPWWWTSTTPSSTSTP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("WWSTSTSSPTPTWSPP", "Woodman"),
                Solution.getResult("WWSTSTSSPTPTWSPP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("TTSTSPWWTTSWPSWP", "Woodman"),
                Solution.getResult("TTSTSPWWTTSWPSWP", "Woodman"));
        assertEquals(Dijkstra.dijkstra("SPPWWWTWTWTSPWTW", "Woodman"),
                Solution.getResult("SPPWWWTWTWTSPWTW", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PTSSWPPWSSSWPTTW", "Woodman"),
                Solution.getResult("PTSSWPPWSSSWPTTW", "Woodman"));
        assertEquals(Dijkstra.dijkstra("PTSPTPWSPTWWWPWW", "Woodman"),
                Solution.getResult("PTSPTPWSPTWWWPWW", "Woodman"));
    }
}

