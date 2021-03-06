module NotGate(a,b) ;

output b ;
input a ;

nand(b,a,a) ;

endmodule 

module AndGate(a,b,c) ;

output c ;
input a,b ;
wire x ;

nand(x,a,b) ;
nand(c,x,x) ; 

endmodule 

module OrGate(a,b,c) ;

output c ;
input a,b ;
wire x,y ;

nand(x,a,a) ;
nand(y,b,b) ;
nand(c,x,y) ;

endmodule 

module XorGate(a,b,c) ;

output c ; 
input a,b ;
wire a_,b_,x,y ;

NotGate Na(a,a_) ;
NotGate Nb(b,b_) ;
AndGate A1(a,b_,x) ;
AndGate A2(a_,b,y) ;
OrGate O(x,y,c) ;

endmodule 

module HalfAdder(a,b,s,c) ;

output s,c ;
input a,b ;

AndGate A(a,b,c) ;
XorGate X(a,b,s) ;

endmodule 

module Inc4Bit(a,b) ;

output [3:0] b ;
input [3:0] a ;
wire [3:0] c ;

HalfAdder H1(a[0],1'b1,b[0],c[0]) ;
HalfAdder H2(a[1],c[0],b[1],c[1]) ; 
HalfAdder H3(a[2],c[1],b[2],c[2]) ; 
HalfAdder H4(a[3],c[2],b[3],c[3]) ; 

endmodule 

module Stim_Tom_B191290CS_TB_Q03 ;

wire [3:0] o ;
reg [3:0] a ;
integer i ;

Inc4Bit IOut(a,o) ;

initial 
begin 
	for(i=0;i<16;i=i+1)
	begin 
		a = i ; #10 ;
	end
end

endmodule 
