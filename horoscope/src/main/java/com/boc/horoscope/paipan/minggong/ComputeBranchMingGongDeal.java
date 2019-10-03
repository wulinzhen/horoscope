package com.boc.horoscope.paipan.minggong;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 第二种方法是用命宫本数来计算命宫，现将地支按数序编出代号以便应用。
 即：寅卯辰已午未申酉戌亥子丑
 123456789101112
 将数序编好，然后取14或26两数为扣减之基数。凡是“月支”与“时支”两个代号数相加的总数不满14者，
 便以14减去总数，所得的余数便为“命宫”的地支数。凡是月支与时支相加之代号总数超过14者，
 则以26减去其代号总数，所得之“余数”即为“命宫”的地支数。
 例如:某男巳月酉时生，巳是4，酉是8，两者相加的总数为12，因不满14数，故以14-12=2,2数代表“卯”，故此人命宫在“卯”。
 又如某人申月丑时生，申数是7，丑数12，两者相加总数为19，因超过14数,故以26-19=7/7”数代“申”，故此人命宫在“申”。
 再如某人是辰月未时生，辰数是3，未数是6，两者相加得总数是9，因不满14数者，故以14-9=5,5代表“午”，
 故此人命宫在“午”，为方便记忆，现编歌诀一首：
 公式查宫须要知，请你背我几句诗。
 寅一卯二顺着数，月时相加君记之。
 十四减去相加数，余数命宫不需疑。
 十四不够用廿六，仍然再减月与时。
 */
@Service("computeBranchMingGongDeal")
public class ComputeBranchMingGongDeal implements MingGongDeal {

    @Resource(name = "verifyMingGongDeal")
    private MingGongDeal verifyMingGongDeal;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        verifyMingGongDeal.deal(paipanRunDTO);
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String monStart = eightCharacterDTO.getMingGongStartBranch();
        String hourBranch = eightCharacterDTO.getHourBranch();
        MonthBranchEnum monStartEnum = MonthBranchEnum.getByBranch(monStart);
        MonthBranchEnum hourBranchEnum = MonthBranchEnum.getByBranch(hourBranch);
        int monStartCode = monStartEnum.getCode();
        int hourBranchCode = hourBranchEnum.getCode();
        int sum = monStartCode + hourBranchCode;
        int mingGongCdoe = 0;
        if (sum <= 14){
            mingGongCdoe = 14 - sum;
        }else {
            mingGongCdoe = 26 - sum;
        }
        MonthBranchEnum mingGongBranchEnum = MonthBranchEnum.getByCode(mingGongCdoe);
        eightCharacterDTO.setMingGongBranch(mingGongBranchEnum.getBranch());
    }
}
