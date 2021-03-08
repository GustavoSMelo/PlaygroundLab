'use strict'

const canvas = window.document.querySelector('#canvas')
const ctx = canvas.getContext('2d')

ctx.fillStyle = '#7159ac'
ctx.fillRect(0, 0, 300,300)


ctx.moveTo(200, 100)
ctx.lineTo(500, 500)

ctx.stroke()
