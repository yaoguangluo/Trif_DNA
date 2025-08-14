	.section	__TEXT,__text,regular,pure_instructions
	.build_version macos, 12, 0	sdk_version 13, 1
	.globl	_processDouble                  ; -- Begin function processDouble
	.p2align	2
_processDouble:                         ; @processDouble
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #64
	stp	x29, x30, [sp, #48]             ; 16-byte Folded Spill
	add	x29, sp, #48
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	stur	x0, [x29, #-8]
	stur	x1, [x29, #-16]
	stur	w2, [x29, #-20]
	str	w3, [sp, #24]
	str	w4, [sp, #20]
	ldr	w8, [sp, #24]
	ldur	w9, [x29, #-20]
	subs	w8, w8, w9
	add	w8, w8, #1
	str	w8, [sp, #16]
	ldr	w8, [sp, #16]
	subs	w8, w8, #7
	b.lt	LBB0_7
	b	LBB0_1
LBB0_1:
	ldr	w8, [sp, #20]
	subs	w8, w8, #70
	b.gt	LBB0_7
	b	LBB0_2
LBB0_2:
	ldur	x0, [x29, #-8]
	ldur	x1, [x29, #-16]
	ldur	w2, [x29, #-20]
	ldr	w3, [sp, #24]
	bl	_partition
	str	w0, [sp, #12]
	ldur	w8, [x29, #-20]
	ldr	w9, [sp, #12]
	subs	w9, w9, #1
	subs	w8, w8, w9
	b.ge	LBB0_4
	b	LBB0_3
LBB0_3:
	ldur	x0, [x29, #-8]
	ldur	x1, [x29, #-16]
	ldur	w2, [x29, #-20]
	ldr	w8, [sp, #12]
	subs	w3, w8, #1
	ldr	w8, [sp, #20]
	add	w4, w8, #1
	bl	_processDouble
	b	LBB0_4
LBB0_4:
	ldr	w8, [sp, #12]
	add	w8, w8, #1
	ldr	w9, [sp, #24]
	subs	w8, w8, w9
	b.ge	LBB0_6
	b	LBB0_5
LBB0_5:
	ldur	x0, [x29, #-8]
	ldur	x1, [x29, #-16]
	ldr	w8, [sp, #12]
	add	w2, w8, #1
	ldr	w3, [sp, #24]
	ldr	w8, [sp, #20]
	add	w4, w8, #1
	bl	_processDouble
	b	LBB0_6
LBB0_6:
	b	LBB0_16
LBB0_7:
	ldur	w8, [x29, #-20]
	str	w8, [sp, #8]
	ldr	w8, [sp, #8]
	add	w8, w8, #1
	str	w8, [sp, #4]
	b	LBB0_8
LBB0_8:                                 ; =>This Loop Header: Depth=1
                                        ;     Child Loop BB0_10 Depth 2
	ldr	w8, [sp, #4]
	ldur	w9, [x29, #-20]
	ldr	w10, [sp, #16]
	add	w9, w9, w10
	subs	w8, w8, w9
	b.ge	LBB0_16
	b	LBB0_9
LBB0_9:                                 ;   in Loop: Header=BB0_8 Depth=1
	b	LBB0_10
LBB0_10:                                ;   Parent Loop BB0_8 Depth=1
                                        ; =>  This Inner Loop Header: Depth=2
	ldr	w8, [sp, #4]
	ldur	w9, [x29, #-20]
	subs	w8, w8, w9
	b.le	LBB0_14
	b	LBB0_11
LBB0_11:                                ;   in Loop: Header=BB0_10 Depth=2
	ldur	x8, [x29, #-16]
	ldrsw	x9, [sp, #4]
	ldr	w8, [x8, x9, lsl #2]
	ldur	x9, [x29, #-16]
	ldr	w10, [sp, #4]
	subs	w10, w10, #1
	str	w10, [sp, #4]
	ldr	w9, [x9, w10, sxtw #2]
	subs	w8, w8, w9
	b.ge	LBB0_13
	b	LBB0_12
LBB0_12:                                ;   in Loop: Header=BB0_10 Depth=2
	ldur	x8, [x29, #-16]
	ldr	w9, [sp, #4]
	add	w9, w9, #1
	ldr	w8, [x8, w9, sxtw #2]
	str	w8, [sp]
	ldur	x8, [x29, #-16]
	ldrsw	x9, [sp, #4]
	ldr	w8, [x8, x9, lsl #2]
	ldur	x9, [x29, #-16]
	ldr	w10, [sp, #4]
	add	w10, w10, #1
	str	w8, [x9, w10, sxtw #2]
	ldr	w8, [sp]
	ldur	x9, [x29, #-16]
	ldrsw	x10, [sp, #4]
	str	w8, [x9, x10, lsl #2]
	ldur	x8, [x29, #-8]
	ldr	w9, [sp, #4]
	add	w9, w9, #1
	ldr	w8, [x8, w9, sxtw #2]
	str	w8, [sp]
	ldur	x8, [x29, #-8]
	ldrsw	x9, [sp, #4]
	ldr	w8, [x8, x9, lsl #2]
	ldur	x9, [x29, #-8]
	ldr	w10, [sp, #4]
	add	w10, w10, #1
	str	w8, [x9, w10, sxtw #2]
	ldr	w8, [sp]
	ldur	x9, [x29, #-8]
	ldrsw	x10, [sp, #4]
	str	w8, [x9, x10, lsl #2]
	b	LBB0_13
LBB0_13:                                ;   in Loop: Header=BB0_10 Depth=2
	b	LBB0_10
LBB0_14:                                ;   in Loop: Header=BB0_8 Depth=1
	b	LBB0_15
LBB0_15:                                ;   in Loop: Header=BB0_8 Depth=1
	ldr	w8, [sp, #8]
	add	w9, w8, #1
	str	w9, [sp, #8]
	str	w8, [sp, #4]
	b	LBB0_8
LBB0_16:
	ldp	x29, x30, [sp, #48]             ; 16-byte Folded Reload
	add	sp, sp, #64
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_partition                      ; -- Begin function partition
	.p2align	2
_partition:                             ; @partition
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #64
	.cfi_def_cfa_offset 64
	str	x0, [sp, #56]
	str	x1, [sp, #48]
	str	w2, [sp, #44]
	str	w3, [sp, #40]
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #44]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #48]
	ldrsw	x10, [sp, #40]
	ldr	w9, [x9, x10, lsl #2]
	subs	w8, w8, w9
	b.gt	LBB1_2
	b	LBB1_1
LBB1_1:
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #44]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #20]                   ; 4-byte Folded Spill
	b	LBB1_3
LBB1_2:
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #20]                   ; 4-byte Folded Spill
	b	LBB1_3
LBB1_3:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	str	w8, [sp, #36]
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #44]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #48]
	ldrsw	x10, [sp, #40]
	ldr	w9, [x9, x10, lsl #2]
	subs	w8, w8, w9
	b.gt	LBB1_5
	b	LBB1_4
LBB1_4:
	ldr	x8, [sp, #56]
	ldrsw	x9, [sp, #44]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #16]                   ; 4-byte Folded Spill
	b	LBB1_6
LBB1_5:
	ldr	x8, [sp, #56]
	ldrsw	x9, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #16]                   ; 4-byte Folded Spill
	b	LBB1_6
LBB1_6:
	ldr	w8, [sp, #16]                   ; 4-byte Folded Reload
	str	w8, [sp, #32]
	ldr	w8, [sp, #44]
	str	w8, [sp, #28]
	b	LBB1_7
LBB1_7:                                 ; =>This Loop Header: Depth=1
                                        ;     Child Loop BB1_9 Depth 2
                                        ;     Child Loop BB1_14 Depth 2
	ldr	w8, [sp, #28]
	ldr	w9, [sp, #40]
	subs	w8, w8, w9
	b.ge	LBB1_19
	b	LBB1_8
LBB1_8:                                 ;   in Loop: Header=BB1_7 Depth=1
	b	LBB1_9
LBB1_9:                                 ;   Parent Loop BB1_7 Depth=1
                                        ; =>  This Inner Loop Header: Depth=2
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #28]
	ldr	w9, [x8, x9, lsl #2]
	ldr	w10, [sp, #36]
	mov	w8, #1
	subs	w9, w9, w10
	str	w8, [sp, #12]                   ; 4-byte Folded Spill
	b.gt	LBB1_11
	b	LBB1_10
LBB1_10:                                ;   in Loop: Header=BB1_9 Depth=2
	ldr	w8, [sp, #28]
	add	w9, w8, #1
	str	w9, [sp, #28]
	ldr	w9, [sp, #40]
	subs	w8, w8, w9
	cset	w8, ge
	str	w8, [sp, #12]                   ; 4-byte Folded Spill
	b	LBB1_11
LBB1_11:                                ;   in Loop: Header=BB1_9 Depth=2
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	tbnz	w8, #0, LBB1_13
	b	LBB1_12
LBB1_12:                                ;   in Loop: Header=BB1_9 Depth=2
	b	LBB1_9
LBB1_13:                                ;   in Loop: Header=BB1_7 Depth=1
	b	LBB1_14
LBB1_14:                                ;   Parent Loop BB1_7 Depth=1
                                        ; =>  This Inner Loop Header: Depth=2
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #40]
	mov	x10, x9
	subs	w10, w10, #1
	str	w10, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	ldr	w9, [sp, #36]
	subs	w8, w8, w9
	b.le	LBB1_16
	b	LBB1_15
LBB1_15:                                ;   in Loop: Header=BB1_14 Depth=2
	b	LBB1_14
LBB1_16:                                ;   in Loop: Header=BB1_7 Depth=1
	ldr	w8, [sp, #28]
	ldr	w9, [sp, #40]
	add	w9, w9, #1
	str	w9, [sp, #40]
	subs	w8, w8, w9
	b.ge	LBB1_18
	b	LBB1_17
LBB1_17:                                ;   in Loop: Header=BB1_7 Depth=1
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #24]
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #28]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #48]
	ldrsw	x10, [sp, #40]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #24]
	ldr	x9, [sp, #48]
	ldrsw	x10, [sp, #28]
	str	w8, [x9, x10, lsl #2]
	ldr	x8, [sp, #56]
	ldrsw	x9, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #24]
	ldr	x8, [sp, #56]
	ldrsw	x9, [sp, #28]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #56]
	ldrsw	x10, [sp, #40]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #24]
	ldr	x9, [sp, #56]
	ldrsw	x10, [sp, #28]
	str	w8, [x9, x10, lsl #2]
	b	LBB1_18
LBB1_18:                                ;   in Loop: Header=BB1_7 Depth=1
	b	LBB1_7
LBB1_19:
	ldr	x8, [sp, #48]
	ldrsw	x9, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #48]
	ldrsw	x10, [sp, #44]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #36]
	ldr	x9, [sp, #48]
	ldrsw	x10, [sp, #40]
	str	w8, [x9, x10, lsl #2]
	ldr	x8, [sp, #56]
	ldrsw	x9, [sp, #40]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #56]
	ldrsw	x10, [sp, #44]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #32]
	ldr	x9, [sp, #56]
	ldrsw	x10, [sp, #40]
	str	w8, [x9, x10, lsl #2]
	ldr	w0, [sp, #40]
	add	sp, sp, #64
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap                           ; -- Begin function swap
	.p2align	2
_swap:                                  ; @swap
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #48
	.cfi_def_cfa_offset 48
	str	x0, [sp, #40]
	str	w1, [sp, #36]
	str	w2, [sp, #32]
	ldr	x8, [sp, #40]
	ldrsw	x9, [sp, #36]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #12]
	ldr	x8, [sp, #40]
	ldrsw	x9, [sp, #32]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #40]
	ldrsw	x10, [sp, #36]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #12]
	ldr	x9, [sp, #40]
	ldrsw	x10, [sp, #32]
	str	w8, [x9, x10, lsl #2]
	mov	w0, #0
	add	sp, sp, #48
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap0                          ; -- Begin function swap0
	.p2align	2
_swap0:                                 ; @swap0
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #32
	.cfi_def_cfa_offset 32
	str	x0, [sp, #24]
	str	w1, [sp, #20]
	str	w2, [sp, #16]
	ldr	x8, [sp, #24]
	ldrsw	x9, [sp, #20]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #12]
	ldr	x8, [sp, #24]
	ldrsw	x9, [sp, #16]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #24]
	ldrsw	x10, [sp, #20]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #12]
	ldr	x9, [sp, #24]
	ldrsw	x10, [sp, #16]
	str	w8, [x9, x10, lsl #2]
	mov	w0, #3
	add	sp, sp, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap1                          ; -- Begin function swap1
	.p2align	2
_swap1:                                 ; @swap1
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #32
	.cfi_def_cfa_offset 32
	str	x0, [sp, #24]
	str	w1, [sp, #20]
	str	w2, [sp, #16]
	ldr	x8, [sp, #24]
	ldrsw	x9, [sp, #20]
	ldr	w8, [x8, x9, lsl #2]
	str	w8, [sp, #12]
	ldr	x8, [sp, #24]
	ldrsw	x9, [sp, #16]
	ldr	w8, [x8, x9, lsl #2]
	ldr	x9, [sp, #24]
	ldrsw	x10, [sp, #20]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #12]
	ldr	x9, [sp, #24]
	ldrsw	x10, [sp, #16]
	str	w8, [x9, x10, lsl #2]
	ldr	w8, [sp, #20]
	ldr	w9, [sp, #16]
	add	w8, w8, w9
	str	w8, [sp, #8]
	ldr	w0, [sp, #8]
	add	sp, sp, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap11                         ; -- Begin function swap11
	.p2align	2
_swap11:                                ; @swap11
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #16
	.cfi_def_cfa_offset 16
	mov	w8, #1
	str	w8, [sp, #8]
	mov	w8, #2
	str	w8, [sp, #4]
	ldr	w0, [sp, #12]
	add	sp, sp, #16
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap2                          ; -- Begin function swap2
	.p2align	2
_swap2:                                 ; @swap2
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #16
	.cfi_def_cfa_offset 16
	fmov	d0, #1.00000000
	str	d0, [sp]
	ldr	w0, [sp, #12]
	add	sp, sp, #16
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap3                          ; -- Begin function swap3
	.p2align	2
_swap3:                                 ; @swap3
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	mov	x0, #4
	bl	_malloc
	str	x0, [sp]
	ldur	w0, [x29, #-4]
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap4                          ; -- Begin function swap4
	.p2align	2
_swap4:                                 ; @swap4
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	mov	x0, #4
	bl	_malloc
	str	x0, [sp]
	ldr	x9, [sp]
	mov	w8, #1
	str	w8, [x9]
	ldur	w0, [x29, #-4]
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap5                          ; -- Begin function swap5
	.p2align	2
_swap5:                                 ; @swap5
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	mov	x0, #8
	bl	_malloc
	str	x0, [sp]
	ldr	x9, [sp]
	mov	w8, #1
	str	w8, [x9]
	ldr	x9, [sp]
	mov	w8, #2
	str	w8, [x9]
	ldur	w0, [x29, #-4]
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap6                          ; -- Begin function swap6
	.p2align	2
_swap6:                                 ; @swap6
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	str	w0, [sp, #8]
	mov	x0, #8
	bl	_malloc
	str	x0, [sp]
	ldr	x9, [sp]
	mov	w8, #1
	str	w8, [x9]
	ldr	x9, [sp]
	mov	w8, #2
	str	w8, [x9]
	ldur	w0, [x29, #-4]
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap7                          ; -- Begin function swap7
	.p2align	2
_swap7:                                 ; @swap7
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	str	x0, [sp, #16]
	str	w1, [sp, #12]
	mov	x0, #8
	bl	_malloc
	str	x0, [sp]
	ldr	x9, [sp]
	mov	w8, #1
	str	w8, [x9]
	ldr	x9, [sp]
	mov	w8, #2
	str	w8, [x9]
	ldur	w0, [x29, #-4]
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_swap8                          ; -- Begin function swap8
	.p2align	2
_swap8:                                 ; @swap8
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	str	x0, [sp, #16]
	str	x1, [sp, #8]
	mov	x0, #8
	bl	_malloc
	str	x0, [sp, #8]
	ldr	x9, [sp, #8]
	mov	w8, #1
	str	w8, [x9]
	ldr	x9, [sp, #8]
	mov	w8, #2
	str	w8, [x9]
	ldur	w0, [x29, #-4]
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.cfi_endproc
                                        ; -- End function
.subsections_via_symbols
