export default class Game{
    score = 0;
    lines = 0; 
    level = 0; 
    playfild = [
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
        [0,0,0,0,0,0,0,0,0,0],
    ];
    activePiece = {
        x: 0,
        y: 0,
        blocks:[
            [0,1,0],
            [1,1,1],
            [0,0,0],
        ]
    }; 
    movePieceLeft(){
        this.activePiece.x -= 1;

        if(this.isPieceOtOfBounds()){
            this.activePiece.x += 1;  
        }
    }

    movePieceRight(){
        this.activePiece.x += 1;  
        
        if(this.isPieceOtOfBounds()){
            this.activePiece.x -= 1;  
        }
    }

    movePieceDown(){
        this.activePiece.y += 1;   

        if(this.isPieceOtOfBounds()){
            this.activePiece.y -= 1;  
        }
    }

    isPieceOtOfBounds(){
        const  playfild = this.playfild
        const { y, x } = this.activePiece; 

        return playfild[y] === undefined || playfild[y][x] === undefined; 
    }

    lockPiece(){
        const { y: pieceY, x: pieceX, blocks } = this.activePiece;  

        for (let y = 0; y < blocks.length; y++) {
            for (let x = 0; x < blocks[y].length; x++) {
                this.playfild[pieceX + y][pieceX + x] = blocks[y][x]; 
            }
        }
    }
}