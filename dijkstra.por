programa{
    funcao inicio(){
        inteiro n=5
        inteiro grafo[5][5]
        inteiro distancia[5]
        inteiro origem,atual,menor
        inteiro i,j,v
        logico visitando[5]
        inteiro matriz[5][5]={
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0}
            
    }

        para(i=0; i<n; i++){
            para(j=0; j<n ; j++){
            grafo[i][j] = matriz[i][j]
            } // laco for de dentro
        }// laco for de fora

        escreva("\nALGORITMO DIJISKTRA")
        escreva("\nVerticais: 0, 1, 2, 3, 4")
        escreva("\nInforme o vertice de origem: ")
        leia(origem)

        para(i=0; i<n; i++){
            distancia[i]=9999
            visitando[i]=falso
        }
        distancia[origem]=0
        para(i=0; i<n; i++){
            menor=9999
            atual=-1
            para(j=0; j<n; j++){
                se(visitando[j]==falso e distancia[j]<menor){
                    menor=distancia[j]
                    atual=j
                }
                
                se(atual == -1){
                    pare
                }

                para(v=0; v<n; v++){
                    se(grafo[atual][v]>0 e visitando[v]==falso){
                        se(distancia[atual]+grafo[atual][v]<distancia[v]){
                            distancia[v] = distancia[atual]+grafo[atual][v]
                        } // if de dentro

                    } // if de fora

                } // laco for de dentro

            } // laco for do meio
            
        }// laco for de fora

        escreva("\nMenores distancias ",origem,":\n")
        para(i=0; i<n; i++){
            escreva("Vertice ",i,"=",distancia[i],"\n")
        }
    }
}
