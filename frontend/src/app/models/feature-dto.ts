import { Link } from "./Link"

export interface FeatureDto {
    id: string
    name: string
    lat: number
    lon: number
    serviceMapUrl: Link | undefined
    siteUrl: Link | undefined
}