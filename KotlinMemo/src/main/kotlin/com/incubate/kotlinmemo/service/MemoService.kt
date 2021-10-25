package com.incubate.kotlinmemo.service

import com.incubate.kotlinmemo.dto.MemoCreateUpdateDto
import com.incubate.kotlinmemo.dto.MemoPreviewDto
import com.incubate.kotlinmemo.dto.MemoResponseDto
import java.time.LocalDate

interface MemoService {
    fun createMemo(memo:MemoCreateUpdateDto): MemoResponseDto
    fun updateMemo(memo_id:Long, memo:MemoCreateUpdateDto): MemoPreviewDto
    fun deleteMemo(memo_id:Long)
    fun getMemoAfterDate(date:LocalDate, page:Int): List<MemoPreviewDto>
    fun MemoInfo(memo_id: Long):MemoResponseDto

}