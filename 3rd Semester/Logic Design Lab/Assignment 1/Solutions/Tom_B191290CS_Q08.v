module AndGate(a,b,c) ;

output c ;
input a,b ;
wire x ;

nand(x,a,b);
nand(c,x,x) ;

endmodule 

module AndGate16(a,b,c) ;

output [0:15] c ;
input [0:15] a,b ;

AndGate AG_1[0:15](a,b,c) ;

endmodule 
